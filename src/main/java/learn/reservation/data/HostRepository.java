package learn.reservation.data;

import learn.reservation.models.Host;

import java.util.List;

public interface HostRepository {
    Host add(Host host) throws DataException;

    List<Host> findAll();

    Host findById(String id);

    List<Host> findByState(String stateAbbr);

    //TODO include update
    //TODO include remove
}
