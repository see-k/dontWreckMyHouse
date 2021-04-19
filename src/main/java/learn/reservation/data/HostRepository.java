package learn.reservation.data;

import learn.reservation.models.Host;

import java.util.List;

public interface HostRepository {
    List<Host> findAll();

    Host findById(String id);

    Host findByEmail(String email) throws DataException;

    //TODO include update
    //TODO include remove
}
