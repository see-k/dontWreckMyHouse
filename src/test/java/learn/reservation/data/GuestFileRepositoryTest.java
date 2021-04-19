package learn.reservation.data;

import learn.reservation.models.Guest;
import learn.reservation.models.Guest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuestFileRepositoryTest {
    static final String SEED_PATH = "./data/guests-seed.csv";
    static final String TEST_PATH = "./data/guests-test.csv";

    GuestFileRepository repo = new GuestFileRepository(TEST_PATH);

    @BeforeEach
    void setup() throws IOException {
        Path seedPath = Paths.get(SEED_PATH);
        Path testPath = Paths.get(TEST_PATH);
        Files.copy(seedPath, testPath, StandardCopyOption.REPLACE_EXISTING);
    }


    @Test
    void shouldFindAll() {
        List<Guest> all = repo.findAll();
        assertEquals(1000, all.size());
    }

    @Test
    void findByEmail() {
        Guest all = repo.findByEmail("gfritz6@ustream.tv");
        assertEquals("NY", all.getState());
    }

    private Guest makeGuest(){
        Guest guest = new Guest();
        guest.setId(1);
        guest.setFirstName("John");
        guest.setLastName("Wick");
        guest.setEmail("John@me.com");
        guest.setPhone("555-2222");
        guest.setState("TX");
        return  guest;
    }
}