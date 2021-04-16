package learn.reservation.ui;

import learn.reservation.data.DataException;
import learn.reservation.domain.GuestService;
import learn.reservation.domain.HostService;
import learn.reservation.domain.ReservationService;
import learn.reservation.models.Guest;
import learn.reservation.models.Reservation;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Controller {
    private final HostService hostService;
    private final GuestService guestService;
    private final ReservationService reservationService;
    private final View view;


    public Controller(HostService hostService, GuestService guestService, ReservationService reservationService, View view) {
        this.hostService = hostService;
        this.guestService = guestService;
        this.reservationService = reservationService;
        this.view = view;
    }


    public void run() {
        view.displayHeader("Welcome to Sustainable Foraging");
        try {
            runAppLoop();
        } catch (DataException ex) {
            view.displayException(ex);
        }
        view.displayHeader("Goodbye.");
    }

    private void runAppLoop() throws DataException {
        MainMenuOption option;
        do {
            option = view.selectMainMenuOption();
            switch (option) {
                case VIEW_RESERVATIONS_FOR_HOST:
                    viewByHost();
                    break;
                case MAKE_RESERVATION:
                    view.displayStatus(false, "NOT IMPLEMENTED");
                    view.enterToContinue();
                    break;
                case EDIT_RESERVATION:
                    view.displayStatus(false, "NOT IMPLEMENTED");
                    view.enterToContinue();
                    break;
                case CANCEL_RESERVATION:
                    view.displayStatus(false, "NOT IMPLEMENTED");
                    view.enterToContinue();
                    break;
            }
        } while (option != MainMenuOption.EXIT);
    }

    private void viewByHost() {
        String email = view.getHostEmail();
        List<Reservation> reservations = reservationService.findByHostEmail(email);
        List<Guest> guests = guestService.findAllGuests();
        view.displayHostReservations(reservations, guests);
        view.enterToContinue();
    }
}
