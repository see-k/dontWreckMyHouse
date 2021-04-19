package learn.reservation.data;

import learn.reservation.models.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReservationFileRepositoryTest {

    static final String SEED_PATH = "./data/reservation-seed.csv";
    static final String TEST_PATH = "./data/2e72f86c-b8fe-4265-b4f1-304dea8762db.csv";
    ReservationFileRepository repository = new ReservationFileRepository("./data/");
    String id = "2e72f86c-b8fe-4265-b4f1-304dea8762db";

    @BeforeEach
    void setUp() throws IOException {
        Path seedPath = Paths.get(SEED_PATH);
        Path testPath = Paths.get(TEST_PATH);
        Files.copy(seedPath, testPath, StandardCopyOption.REPLACE_EXISTING);
    }

    @Test
    void shouldAddandUpdate() throws DataException {
        Reservation all = repository.add(makeReservation(), id);
        assertEquals(13, repository.findAll(id).size());
        all.setTotal(new BigDecimal("10000"));
        Reservation update = repository.update(all, id);
        assertEquals(update.getTotal(), all.getTotal());
    }

    @Test
    void shouldFindAll() {
        List<Reservation> all = repository.findAll(id);
        assertEquals(12, all.size());
    }


    @Test
    void delete() throws DataException {
        Reservation reservation = repository.delete(11, id );
        assertEquals(11, repository.findAll(id).size());
    }

    private Reservation makeReservation(){
        Reservation reservation = new Reservation();
        reservation.setId(13);
        reservation.setStartDate(LocalDate.of(2022,05,10));
        reservation.setEndDate(LocalDate.of(2022,06,11));
        reservation.setGuestId(952);
        reservation.setTotal(new BigDecimal("2000"));
        return reservation;
    }
}