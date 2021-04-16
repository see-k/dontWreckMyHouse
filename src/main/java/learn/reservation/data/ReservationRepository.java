package learn.reservation.data;

import learn.reservation.models.Reservation;

import java.util.List;

public interface ReservationRepository {
    Reservation add(Reservation reservation, String hostId) throws DataException;

    List<Reservation> findAll(String hostId);

    Reservation update(Reservation reservation);

    Reservation delete(Reservation reservation);

}
