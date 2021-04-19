package learn.reservation.data;

import learn.reservation.models.Host;
import learn.reservation.models.Reservation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationRepositoryDouble implements ReservationRepository {

    private final ArrayList<Reservation> reservations = new ArrayList<>();

    public ReservationRepositoryDouble() {
        Reservation reservation = new Reservation();
        List<String> emails = new ArrayList<>();
        List<LocalDate> dates = new ArrayList<>();
        emails.add("ogecks1@dagondesign.com");
        emails.add("eyearnes0@sfgate.com");
        dates.add(LocalDate.of(2021,10, 1));
        dates.add(LocalDate.of(2021,12, 3));
        BigDecimal total = new BigDecimal("2000");

        reservation.setId(15);
        reservation.setStartDate(dates.get(0));
        reservation.setEndDate(dates.get(1));
        reservation.setGuestId(1);
        reservation.setTotal(total);

        reservations.add(reservation);
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
        reservations.addAll(all);
        return reservation;
    }

    @Override
    public List<Reservation> findAll(String hostId) {
        return reservations;
    }

    @Override
    public Reservation update(Reservation reservation, String hostId) throws DataException {
        List<Reservation> all = findAll(hostId);

        Reservation toUpdate = all.stream()
                .filter(i->i.getId() == reservation.getId())
                .findFirst()
                .orElse(null);
        all.remove(toUpdate);
        toUpdate.setStartDate(reservation.getStartDate());
        toUpdate.setEndDate(reservation.getEndDate());
        toUpdate.setTotal(reservation.getTotal());
        all.add(toUpdate);
        reservations.addAll(all);
        return toUpdate;
    }

    @Override
    public Reservation delete(int guestId, String hostId) throws DataException {
        List<Reservation> all = findAll(hostId);

        Reservation toRemove = all.stream()
                .filter(i->i.getGuestId() == guestId)
                .findFirst()
                .orElse(null);
        all.remove(toRemove);
        reservations.addAll(all);
        return toRemove;
    }

    @Override
    public List<Reservation> findGuestReservations(int guestId, List<Host> hosts) {
        return null;
    }
}
