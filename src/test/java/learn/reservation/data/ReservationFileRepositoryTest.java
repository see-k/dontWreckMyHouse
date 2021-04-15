package learn.reservation.data;

import learn.reservation.models.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReservationFileRepositoryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
    }

    @Test
    void shouldFindAll() {
        ReservationFileRepository repo = new ReservationFileRepository("./data/reservations/");
        List<Reservation> all = repo.findAll("2e72f86c-b8fe-4265-b4f1-304dea8762db");
        assertEquals(12, all.size());


    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}