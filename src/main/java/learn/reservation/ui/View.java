package learn.reservation.ui;

import learn.reservation.models.Guest;
import learn.reservation.models.Reservation;
import org.springframework.stereotype.Component;

import java.util.List;

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
                     reservation.getEndDate());

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

    }
