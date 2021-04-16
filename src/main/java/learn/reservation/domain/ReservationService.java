package learn.reservation.domain;

import learn.reservation.data.DataException;
import learn.reservation.data.GuestRepository;
import learn.reservation.data.HostRepository;
import learn.reservation.data.ReservationRepository;
import learn.reservation.models.Host;
import learn.reservation.models.Reservation;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
@Service
public class ReservationService {
    private final HostRepository hostRepository;
    private final GuestRepository guestRepository;
    private  final ReservationRepository reservationRepository;

    public ReservationService(HostRepository hostRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.hostRepository = hostRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findByHostEmail(String email)
    {
        String hostId = hostRepository.findByEmail(email).getId();
        return reservationRepository.findAll(hostId);
    }

    public Result<Reservation> add(List<String> emails, List<LocalDate> dates, BigDecimal total) throws DataException {

        String hostId = hostRepository.findByEmail(emails.get(1)).getId();

        Reservation reservation = new Reservation();
        reservation.setStartDate(dates.get(0));
        reservation.setEndDate(dates.get(1));
        reservation.setGuestId(guestRepository.findByEmail(emails.get(0)).getId());
        reservation.setTotal(total);

        Result<Reservation> result = validate(reservation);

        //TODO validate
        if(!result.isSuccess())
            return result;
        result.setPayload(reservationRepository.add(reservation, hostId));
        return result;
    }

    private Result<Reservation> validate(Reservation reservation) {
        Result<Reservation> result = validateNulls(reservation);
        return result;
    }

    private Result<Reservation> validateNulls(Reservation reservation) {
        Result<Reservation> result = new Result<>();
        if(reservation == null){
            result.addErrorMessage("Entry cannot be empty!");
            return  result;
        }
        return result;
    }
}
