package learn.reservation.domain;

import learn.reservation.data.GuestRepository;
import learn.reservation.models.Guest;
import learn.reservation.models.Host;
import learn.reservation.models.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class GuestService {
    private final GuestRepository repository;

    public GuestService(GuestRepository repository) {
        this.repository = repository;
    }

    public Guest findByHostEmail(String email) {
        return repository.findByEmail(email);
    }

    public List<Guest> findAllGuests(){
        return repository.findAll();
    }

    public Guest findById(int id){
        return repository.findById(id);
    }

}
