package learn.reservation.domain;

import learn.reservation.data.*;
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
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReservationServiceTest {
    static final String GUEST_SEED_PATH = "./data/guests-seed.csv";
    static final String GUEST_TEST_PATH = "./data/guests-test.csv";

    static final String HOST_SEED_PATH = "./data/hosts-seed.csv";
    static final String HOST_TEST_PATH = "./data/hosts-test.csv";

    static final String RESERVATION_SEED_PATH = "./data/guests-seed.csv";
    static final String RESERVATION_TEST_PATH = "./data/guests-test.csv";

    GuestRepository guestFileRepository = new GuestFileRepository(GUEST_TEST_PATH);
    HostRepository hostFileRepository = new HostFileRepository(HOST_TEST_PATH);
    ReservationRepository reservationFileRepository = new ReservationRepositoryDouble();
    ReservationService reservationService = new ReservationService(hostFileRepository, guestFileRepository, reservationFileRepository);


    @BeforeEach
    void setup() throws IOException {
        Path seedPathGuest = Paths.get(GUEST_SEED_PATH);
        Path testPathGuest = Paths.get(GUEST_TEST_PATH);
        Files.copy(seedPathGuest, testPathGuest, StandardCopyOption.REPLACE_EXISTING);


        Path seedPathHost = Paths.get(HOST_SEED_PATH);
        Path testPathHost = Paths.get(HOST_TEST_PATH);
        Files.copy(seedPathHost, testPathHost, StandardCopyOption.REPLACE_EXISTING);

        ReservationRepository reservationFileRepository = new ReservationRepositoryDouble();

    }

    @Test
    void shouldFindByHostEmail() throws DataException {
        List<Reservation> all = reservationService.findByHostEmail("eyearnes0@sfgate.com");
        assertEquals(1, all.size());
    }

    @Test
    void shouldNotFindByHostEmail() throws DataException {
        assertThrows(NullPointerException.class,
                ()->reservationService.findByHostEmail("chike@yahoo.com"));
    }

    @Test
    void shouldAdd() throws DataException {
        List<String> emails = new ArrayList<>();
        List<LocalDate> dates = new ArrayList<>();
        emails.add("slomas0@mediafire.com");
        emails.add("eyearnes0@sfgate.com");
        dates.add(LocalDate.of(2029,11, 1));
        dates.add(LocalDate.of(2029,11, 3));
        BigDecimal total = new BigDecimal("2000");
        Result<Reservation> result = reservationService.add(emails, dates, total);
        assertEquals(0, result.getErrorMessages().size());
    }

    @Test
    void shouldFailToValidateDate() throws DataException {
        List<String> emails = new ArrayList<>();
        List<LocalDate> dates = new ArrayList<>();
        emails.add("slomas0@mediafire.com");
        emails.add("eyearnes0@sfgate.com");
        BigDecimal total = null;

        dates.add(LocalDate.of(2029,11, 1));
        dates.add(LocalDate.of(2029,10, 3));
        Result<Reservation> result = reservationService.add(emails, dates, null);
        assertTrue(result.getErrorMessages().contains("Start date must commence before end date!"));
        assertTrue(result.getErrorMessages().contains("Total cost for stay cannot be empty!"));

    }

    @Test
    void shouldFailToValidateDuplicate() throws DataException {
        List<String> emails = new ArrayList<>();
        List<LocalDate> dates = new ArrayList<>();
        emails.add("ogecks1@dagondesign.com");
        emails.add("eyearnes0@sfgate.com");
        dates.add(LocalDate.of(2021,10, 1));
        dates.add(LocalDate.of(2021,12, 3));
        BigDecimal total = new BigDecimal("2000");
        Result<Reservation> result = reservationService.add(emails, dates, total);
        assertTrue(result.getErrorMessages().contains("We already have this date reserved for you!"));
    }

    @Test
    void shouldFindByGuestEmail() throws  DataException{
        List<Reservation> reservations = reservationService.findByGuestEmail("ogecks1@dagondesign.com");
        assertEquals(1, reservations.size());
    }


}