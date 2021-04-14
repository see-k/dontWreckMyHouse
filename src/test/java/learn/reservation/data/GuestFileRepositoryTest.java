package learn.reservation.data;

import learn.reservation.models.Guest;
import learn.reservation.models.Guest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuestFileRepositoryTest {

    @Test
    void add() {
    }

    @Test
    void shouldFindAll() {
        GuestFileRepository repo = new GuestFileRepository("./data/guests-seed.csv");
        List<Guest> all = repo.findAll();
        assertEquals(1000, all.size());
    }

    @Test
    void findByEmail() {
        GuestFileRepository repo = new GuestFileRepository("./data/guests-seed.csv");
        Guest all = repo.findByEmail("gfritz6@ustream.tv");
        assertEquals("NY", all.getState());
    }
}