package learn.reservation.data;

import learn.reservation.models.Reservation;

import java.util.List;

public interface ReservationRepository {
    Reservation add(Reservation reservation) throws DataException;

    List<Reservation> findAll();

    Reservation update(Reservation reservation);

    Reservation delete(Reservation reservation);

}
