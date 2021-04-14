package learn.reservation.data;

import learn.reservation.models.Host;

import java.util.List;

public interface HostRepository {
    Host add(Host host) throws DataException;

    List<Host> findAll();

    Host findById(String id);

    Host findByEmail(String email);

    //TODO include update
    //TODO include remove
}
