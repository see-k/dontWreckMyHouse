package learn.reservation.domain;

import learn.reservation.data.HostRepository;
import learn.reservation.models.Host;

public class HostService {
    private final HostRepository hostRepository;

    public HostService(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    public Host findByEmail(String email){
        return hostRepository.findByEmail(email);
    }


}
