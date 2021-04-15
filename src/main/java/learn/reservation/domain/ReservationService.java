package learn.reservation.domain;

import learn.reservation.data.GuestRepository;
import learn.reservation.data.HostRepository;
import learn.reservation.data.ReservationRepository;
import learn.reservation.models.Host;
import learn.reservation.models.Reservation;

import java.util.List;

public class ReservationService {
    private final HostRepository hostRepository;
    private final GuestRepository guestRepository;
    private  final ReservationRepository reservationRepository;

    public ReservationService(HostRepository hostRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.hostRepository = hostRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findByEmail(String email)
    {
        String hostId = hostRepository.findByEmail(email).getId();
        return reservationRepository.findAll(hostId);
    }
}
