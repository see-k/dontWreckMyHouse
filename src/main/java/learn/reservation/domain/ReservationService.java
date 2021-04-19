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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Reservation> findByHostEmail(String email) throws DataException
    {
        String hostId = hostRepository.findByEmail(email).getId();
        return  reservationRepository.findAll(hostId);
    }

    public List<Reservation> findByGuestEmail(String email) throws DataException{
        int guestId = guestRepository.findByEmail(email).getId();
        List<Host> hosts = hostRepository.findAll();
        return  reservationRepository.findGuestReservations(guestId, hosts);
    }

    public List<Reservation> findByState(String state) throws DataException
    {
        List<Reservation> reservationsInState = new ArrayList<>();
         List<Host> hostsInState = hostRepository.findAll().stream()
                 .filter(i->i.getState().equalsIgnoreCase(state))
                 .collect(Collectors.toList());
         for(Host thisHost : hostsInState)
             reservationsInState.addAll(reservationRepository.findAll(thisHost.getId()));
         return reservationsInState;
    }

    public Result<Reservation> add(List<String> emails, List<LocalDate> dates, BigDecimal total) throws DataException {

        String hostId = hostRepository.findByEmail(emails.get(1)).getId();
        Reservation reservation = new Reservation();
        reservation.setStartDate(dates.get(0));
        reservation.setEndDate(dates.get(1));
        reservation.setGuestId(guestRepository.findByEmail(emails.get(0)).getId());
        reservation.setTotal(total);
        Result<Reservation> result = validate(reservation, hostId);
        if(!result.isSuccess())
            return result;
        result.setPayload(reservationRepository.add(reservation, hostId));
        return result;
    }


   public Result<Reservation> update(Reservation reservation, String hostId) throws DataException {
       Result<Reservation> result = validate(reservation, hostId);
       //TODO validate
       if (!result.isSuccess())
           return result;
       result.setPayload(reservationRepository.update(reservation, hostId));
       return result;
   }

    public Result<Reservation> remove(int id, String hostId) throws DataException {
        Reservation update = reservationRepository.delete(id, hostId);
        Result<Reservation> result = validate(update, hostId);
        //TODO validate
        if(!result.isSuccess())
            return result;
        result.setPayload(update);
        return result;
    }

    private Result<Reservation> validate(Reservation reservation, String hostId) {
        Result<Reservation> result = validateNulls(reservation);
        validateFields(reservation, hostId, result);
        return result;
    }

    private Result<Reservation> validateNulls(Reservation reservation) {
        Result<Reservation> result = new Result<>();
        if(reservation == null){
            result.addErrorMessage("Entry cannot be empty!");
            return  result;
        }

        if(reservation.getTotal() == null){
            result.addErrorMessage("Total cost for stay cannot be empty!");
            return  result;
        }

        return result;
    }

    private void validateFields(Reservation reservation, String hostId, Result<Reservation> result)
    {

        //The start date must come before the end date.
        if(reservation.getStartDate().compareTo(reservation.getEndDate())>=0)
        {
            result.addErrorMessage("Start date must commence before end date!");
        }

        //The start date must be in the future.
        if(reservation.getStartDate().compareTo(LocalDate.now()) <= 0 )
        {
            result.addErrorMessage("Start date must be in the future!");
        }

        //The reservation may never overlap existing reservation dates.
        List<Reservation> reservations = reservationRepository.findAll(hostId).stream()
                .filter(i->i.getStartDate().compareTo(reservation.getStartDate()) == 0)
                .collect(Collectors.toList());
        for(Reservation thisReservation:reservations)
        {
            if(thisReservation.getEndDate().compareTo(reservation.getEndDate()) == 0)
                    result.addErrorMessage("We already have this date reserved for you!");
        }
    }

}