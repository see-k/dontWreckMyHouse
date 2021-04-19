package learn.reservation.data;

import learn.reservation.models.Host;
import learn.reservation.models.Reservation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository {
    Reservation add(Reservation reservation, String hostId) throws DataException;

    List<Reservation> findAll(String hostId);

    Reservation update(Reservation reservation, String hostId) throws DataException;

    Reservation delete(int reservationId, String hostId) throws DataException;

    List<Reservation> findGuestReservations(int reservationId, List<Host> hosts);


}
