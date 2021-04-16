package learn.reservation.data;

import learn.reservation.models.Guest;
import learn.reservation.models.Guest;
import learn.reservation.models.Host;

import java.util.List;

public interface GuestRepository {
    Guest add(Guest guest) throws DataException;

    List<Guest> findAll();

    Guest findByEmail(String email);

    Guest findById(int id);

    //TODO include update
    //TODO include remove
}
