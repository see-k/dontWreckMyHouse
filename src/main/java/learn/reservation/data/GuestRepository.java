package learn.reservation.data;

import learn.reservation.models.Guest;
import learn.reservation.models.Guest;
import learn.reservation.models.Host;

import java.util.List;

public interface GuestRepository {
    List<Guest> findAll();

    Guest findByEmail(String email);
}
