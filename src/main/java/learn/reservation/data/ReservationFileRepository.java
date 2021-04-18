package learn.reservation.data;

import learn.reservation.models.Host;
import learn.reservation.models.Reservation;
import learn.reservation.models.Reservation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ReservationFileRepository implements ReservationRepository {
    private static final String HEADER = "id,start_date,end_date,guest_id,total";
    private final String filePath;

    public ReservationFileRepository(@Value("${dataFilePathReservation}")String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Reservation add(Reservation reservation, String hostId) throws DataException {
        if(reservation == null)
            return null;
        List<Reservation> all = findAll(hostId);

        int nextId = all.stream()
                .mapToInt(Reservation::getId)
                .max()
                .orElse(0) + 1;
        reservation.setId(nextId);

        all.add(reservation);
        writeAll(all, hostId);
        return reservation;
    }

    @Override
    public Reservation update(int guestId, String hostId, List<LocalDate> dates, BigDecimal total) throws DataException{
        List<Reservation> all = findAll(hostId);

        Reservation toUpdate = all.stream()
                .filter(i->i.getGuestId() == guestId)
                .findFirst()
                .orElse(null);
        all.remove(toUpdate);
        toUpdate.setStartDate(dates.get(0));
        toUpdate.setEndDate(dates.get(1));
        toUpdate.setTotal(total);
        all.add(toUpdate);
        writeAll(all, hostId);
        return toUpdate;
    }
    @Override
    public Reservation delete(int guestId, String hostId) throws DataException{
        List<Reservation> all = findAll(hostId);

        Reservation toRemove = all.stream()
                .filter(i->i.getGuestId() == guestId)
                .findFirst()
                .orElse(null);
        all.remove(toRemove);
        writeAll(all, hostId);
        return toRemove;
    }
    @Override
    public List<Reservation> findAll(String hostId) {
        ArrayList<Reservation> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(getFilePath(hostId)))) {

            reader.readLine(); // read header

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {

                String[] fields = line.split(",", -1);
                if (fields.length == 5) {
                    result.add(deserialize(fields));
                }
            }
        } catch (IOException ex) {
            // don't throw on read
        }
        return result;
    }

    private String getFilePath(String id) {
        return Paths.get(filePath, id + ".csv").toString();
    }

    private Reservation deserialize(String[] fields) {
        String[] startDate = fields[1].split("-"),
                endDate = fields[2].split("-");

        Reservation reservation = new Reservation();
        reservation.setId(Integer.parseInt(fields[0]));

        reservation.setStartDate(LocalDate.of(Integer.parseInt(startDate[0])
                ,Integer.parseInt(startDate[1])
                , Integer.parseInt(startDate[2])));
        reservation.setEndDate(LocalDate.of(Integer.parseInt(endDate[0])
                ,Integer.parseInt(endDate[1])
                , Integer.parseInt(endDate[2])));
        reservation.setGuestId(Integer.parseInt(fields[3]));
        reservation.setTotal(new BigDecimal(fields[4]));
        return  reservation;
    }



    protected void writeAll(List<Reservation> Reservations, String id ) throws DataException {
        try (PrintWriter writer = new PrintWriter(getFilePath(id))) {

            writer.println(HEADER);

            if (Reservations == null) {
                return;
            }

            for (Reservation Reservation : Reservations) {
                writer.println(serialize(Reservation));
            }

        } catch (FileNotFoundException ex) {
            throw new DataException(ex);
        }
    }

    private String serialize(Reservation reservation) {
        return String.format("%s,%s,%s,%s,%s",
                reservation.getId(),
                reservation.getStartDate(),
                reservation.getEndDate(),
                reservation.getGuestId(),
                reservation.getTotal());
    }
}
