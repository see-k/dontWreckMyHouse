package learn.reservation.data;

import learn.reservation.models.Reservation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository {
    Reservation add(Reservation reservation, String hostId) throws DataException;

    List<Reservation> findAll(String hostId);

    Reservation update(int guestId, String hostId, List<LocalDate> dates, BigDecimal total) throws DataException;

    Reservation delete(int guestId, String hostId) throws DataException;

}
