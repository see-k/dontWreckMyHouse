package learn.reservation.ui;

import learn.reservation.models.Guest;
import learn.reservation.models.Reservation;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Component
public class View {
    private final ConsoleIO io;

    public View(ConsoleIO io) {
        this.io = io;
    }

    public void displayHeader(String message) {
        io.println("");
        io.println(message);
        io.println("=".repeat(message.length()));
    }

    public void displayException(Exception ex) {
        displayHeader("A critical error occurred:");
        io.println(ex.getMessage());
    }

    public MainMenuOption selectMainMenuOption() {
        displayHeader("Main Menu");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (MainMenuOption option : MainMenuOption.values()) {
            if (!option.isHidden()) {
                io.printf("%s. %s%n", option.getValue(), option.getMessage());
            }
            min = Math.min(min, option.getValue());
            max = Math.max(max, option.getValue());
        }

        String message = String.format("Select [%s-%s]: ", min, max);
        return MainMenuOption.fromValue(io.readInt(message, min, max));
    }

    public void displayStatus(boolean success, List<String> messages) {
        displayHeader(success ? "Success" : "Error");
        for (String message : messages) {
            io.println(message);
        }
    }

    public void displayStatus(boolean success, String message) {
        displayStatus(success, List.of(message));
    }

    public void enterToContinue() {
        io.readString("Press [Enter] to continue.");
    }

    public String getHostEmail() {
        displayHeader(MainMenuOption.VIEW_RESERVATIONS_FOR_HOST.getMessage());
        return io.readRequiredString("Host Email: ");
    }

    public void displayHostReservations(List<Reservation> reservations, List<Guest> guests) {
        if(reservations == null || reservations.isEmpty()){
            io.println("No reservations found. Please book one with us!");
            return;
        }
         for(Reservation reservation: reservations){
             io.printf("ID: %s, %s - %s ",
                     reservation.getId(),
                     reservation.getStartDate(),
                     reservation.getEndDate()
             );

                     for(Guest guest: guests) {
                         if(guest.getId() == reservation.getGuestId()){
                             io.printf("Guest: %s, %s, Email: %s%n",
                                     guest.getLastName(),
                                     guest.getFirstName(),
                                     guest.getEmail()
                             );
                         }
                     }

         }

    }

    public int displayGuestReservations(List<Reservation> reservations, Guest guest) {
        if(reservations == null || reservations.isEmpty()){
            io.println("No reservations found. Please book one with us!");
            return 0;
        }
        io.printf("Reservations for %s, %s: %n",guest.getLastName(),
                guest.getFirstName());

        for(Reservation reservation: reservations){
            if(reservation.getGuestId() == guest.getId()){
            io.printf("ID: %s, %s - %s, total: %s %n",
                    reservation.getId(),
                    reservation.getStartDate(),
                    reservation.getEndDate(),
                    reservation.getTotal()
            );
            }
        }

        if(reservations.size() > 1)
            return Integer.parseInt(io.readRequiredString("Index to edit: "));
        else
            return reservations.get(0).getId();
    }

    public void displayReservationsforGuest(List<Reservation> reservations, Guest guest){

        if(reservations.size() == 0)
            io.printf("No reservations found!%n");
        else {
            io.printf("Reservations for %s, %s: %n", guest.getLastName(),
                    guest.getFirstName());

            for (Reservation reservation : reservations) {
                if (reservation.getGuestId() == guest.getId()) {
                    io.printf("ID: %s, %s - %s, total: %s %n",
                            reservation.getId(),
                            reservation.getStartDate(),
                            reservation.getEndDate(),
                            reservation.getTotal()
                    );
                }
            }
        }

    }

    public List<String> getReservationEmails(String header) {
        switch (header.toLowerCase(Locale.ROOT)){
            case "make":
                displayHeader(MainMenuOption.MAKE_RESERVATION.getMessage());
                break;
            case "cancel":
                displayHeader(MainMenuOption.CANCEL_RESERVATION.getMessage());
                break;
            case "edit":
                displayHeader(MainMenuOption.EDIT_RESERVATION.getMessage());
                break;
            default:
                break;
        }

        List<String> emails = new ArrayList<>();
        emails.add(io.readRequiredString("Guest Email: "));
        emails.add(io.readRequiredString("Host Email: "));
        return emails;
    }

    public List<LocalDate> getReservationDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(io.readLocalDate("Start (mm/dd/yyyy): "));
        dates.add(io.readLocalDate("End (mm/dd/yyyy): "));
        return dates;
    }

    public char displayReservationReport(List<LocalDate> dates, BigDecimal total) {
        displayHeader("SUMMARY");
        String response = "";
        io.printf("Start: %s%nEnd: %s%nTotal: %s%n",
                dates.get(0),
                dates.get(1),
                total);
        do{
            response = io.readRequiredString("Is this Okay? [y/n]: ");
        }while (Character.toLowerCase(response.charAt(0)) != 'y' && Character.toLowerCase(response.charAt(0)) != 'n');
            return Character.toLowerCase(response.charAt(0));
    }

    public String getGuestEmail() {
        displayHeader(MainMenuOption.VIEW_RESERVATIONS_FOR_GUEST.getMessage());
        return io.readRequiredString("Guest Email: ");
    }

    public String getState() {
        displayHeader(MainMenuOption.VIEW_RESERVATIONS_BY_STATE.getMessage());
        String state = "";
        do{
            state = io.readRequiredString("State Abbreviation: ");
        }while(state.length() != 2);
        return state;
    }
}
