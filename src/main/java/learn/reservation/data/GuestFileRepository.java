package learn.reservation.data;

import learn.reservation.models.Guest;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GuestFileRepository implements GuestRepository{
    private static final String HEADER = "guest_id,first_name,last_name,email,phone,state";
    private final String filePath;

    public GuestFileRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Guest add(Guest guest) throws DataException {
        if(guest == null)
            return null;
        List<Guest> all = findAll();
        int nextId = all.stream()
                .mapToInt(Guest::getId)
                .max()
                .orElse(0) + 1;
        guest.setId(nextId);
        all.add(guest);
        writeAll(all);
        return guest;
    }

    private void writeAll(List<Guest> items) throws DataException {
        try (PrintWriter writer = new PrintWriter(filePath)) {

            writer.println(HEADER);

            if (items == null) {
                return;
            }

            for (Guest item : items) {
                writer.println(serialize(item));
            }

        } catch (FileNotFoundException ex) {
            throw new DataException(ex);
        }
    }

    private String serialize(Guest guest) {
        return String.format("%s%s%s%s%s%s",
                guest.getId(),
                guest.getFirstName(),
                guest.getLastName(),
                guest.getEmail(),
                guest.getPhone(),
                guest.getState());
    }

    @Override
    public List<Guest> findAll() {
        ArrayList<Guest> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            reader.readLine(); // read header

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {

                String[] fields = line.split(",", -1);
                if (fields.length == 6) {
                    result.add(deserialize(fields));
                }
            }
        } catch (IOException ex) {
            // don't throw on read
        }
        return result;
    }

    private Guest deserialize(String[] fields) {
        Guest result = new Guest();
        result.setId(Integer.parseInt(fields[0]));
        result.setFirstName(fields[1]);
        result.setLastName(fields[2]);
        result.setEmail(fields[3]);
        result.setPhone(fields[4]);
        result.setState(fields[5]);
        return  result;
    }

    @Override
    public Guest findByEmail(String email) {
        return findAll().stream()
                .filter(i -> i.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .orElse(null);
    }
}
