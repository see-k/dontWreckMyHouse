package learn.reservation.data;

import learn.reservation.models.Reservation;
import learn.reservation.models.Reservation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationFileRepository implements ReservationRepository {
    private static final String HEADER = "id,start_date,end_date,Reservation_id,total";
    private final String filePath;

    public ReservationFileRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Reservation add(Reservation reservation) throws DataException {
        return null;
    }

    @Override
    public List<Reservation> findAll() {
        ArrayList<Reservation> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

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
        reservation.setTotal(Integer.parseInt(fields[4]));
        return  reservation;
    }

    @Override
    public Reservation update(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation delete(Reservation reservation) {
        return null;
    }
}
