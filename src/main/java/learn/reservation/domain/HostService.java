package learn.reservation.domain;

import learn.reservation.data.DataException;
import learn.reservation.data.HostRepository;
import learn.reservation.models.Host;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@Service
public class HostService {
    private final HostRepository hostRepository;

    public HostService(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    public Host findByEmail(String email) throws DataException {
        return hostRepository.findByEmail(email);
    }

    public BigDecimal getTotal(String hostEmail, List<LocalDate> dates) throws DataException  {
        //TODO validate emails
        Host host = hostRepository.findByEmail(hostEmail);
        BigDecimal total = new BigDecimal("0");
        LocalDate start = dates.get(0), end = dates.get(1);
        for(LocalDate day = start; day.compareTo(end) < 0 ; day = day.plusDays(1)){
            total =  (day.getDayOfWeek() != DayOfWeek.SATURDAY &&
                    day.getDayOfWeek() != DayOfWeek.SUNDAY)
                    ?total.add(host.getStandardRate())
                    :total.add(host.getWeekendRate());
        }
        return total;
    }

}
