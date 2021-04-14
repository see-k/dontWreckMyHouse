package learn.reservation.data;

import learn.reservation.models.Host;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HostFileRepositoryTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void add() {
    }

    @Test
    void ShouldFindAll() {
        HostFileRepository repo = new HostFileRepository("./data/hosts-seed.csv");
        List<Host> all = repo.findAll();
        assertEquals(1000, all.size());
    }

    @Test
    void ShouldFindById() {
        HostFileRepository repo = new HostFileRepository("./data/hosts-seed.csv");
        Host all = repo.findById("7704ff8f-2fe3-46ce-83d8-be1310d9728a");
        assertEquals("Glennie", all.getLastName());
    }

    @Test
    void findByEmail() {
        HostFileRepository repo = new HostFileRepository("./data/hosts-seed.csv");
        Host all = repo.findByEmail("eyearnes0@sfgate.com");
        assertEquals("Yearnes", all.getLastName());
    }
}