package learn.reservation.data;

import learn.reservation.models.Host;

import java.util.List;

public interface HostRepository {
    Host add(Host host) throws DataException;

    List<Host> findAll();

    List<Host> findById();

    List<Host> findByState();

    //TODO include update
    //TODO include remove
}
