package learn.reservation.data;

import learn.reservation.models.Host;

import java.util.List;

public class HostFileRepository implements HostRepository {

    private static final String HEADER = "id,last_name,email,phone,address,city,state,postal_code,standard_rate,weekend_rate";

    private final String filePath;

    public HostFileRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Host add(Host host) throws DataException {
        return null;
    }

    @Override
    public List<Host> findAll() {
        return null;
    }

    @Override
    public List<Host> findById() {
        return null;
    }

    @Override
    public List<Host> findByState() {
        return null;
    }

    private void writeAll (List<Host> host) throws DataException{}

    private String serialize (Host host){return  null;}

    private String deserialize (String[] fields) {return null;}

}
