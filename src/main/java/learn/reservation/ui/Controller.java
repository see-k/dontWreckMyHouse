package learn.reservation.ui;

import learn.reservation.data.DataException;
import learn.reservation.domain.GuestService;
import learn.reservation.domain.HostService;
import learn.reservation.domain.ReservationService;
import learn.reservation.domain.Result;
import learn.reservation.models.Guest;
import learn.reservation.models.Reservation;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
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
                    makeReservation();
                    break;
                case EDIT_RESERVATION:
                    editReservation();
                    break;
                case CANCEL_RESERVATION:
                    cancelReservation();
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

    private void makeReservation() throws DataException {
        List<String> emails = view.getReservationEmails();
        String guestEmail = emails.get(0), hostEmail = emails.get(1);
        List<Reservation> reservations = reservationService.findByHostEmail(hostEmail);
        List<Guest> guests = guestService.findAllGuests();
        view.displayHostReservations(reservations, guests);
        List<LocalDate> dates = view.getReservationDates();
        BigDecimal total = hostService.getTotal(hostEmail, dates);
        char response = view.displayReservationReport(dates, total);
        if(response == 'y') {
            Result<Reservation> result = reservationService.add(emails, dates, total);
            if (!result.isSuccess()) {
                view.displayStatus(false, result.getErrorMessages());
            } else {
                String successMessage = String.format("Reservation %s created.", result.getPayload().getId());
                view.displayStatus(true, successMessage);
            }
        }
        view.enterToContinue();
    }

    private void editReservation() throws DataException {
        List<String> emails = view.getReservationEmails();
        String guestEmail = emails.get(0), hostEmail = emails.get(1);
        Guest guest = guestService.findByGuestEmail(guestEmail);
        List<Reservation> reservations = reservationService.findByHostEmail(hostEmail);
        view.displayGuestReservations(reservations, guest);
        List<LocalDate> dates = view.getReservationDates();
        BigDecimal total = hostService.getTotal(hostEmail, dates);
        char response = view.displayReservationReport(dates, total);
        if(response == 'y') {
            Result<Reservation> result = reservationService.update(emails, dates, total);
            if (!result.isSuccess()) {
                view.displayStatus(false, result.getErrorMessages());
            } else {
                String successMessage = "Update was successful";
                view.displayStatus(true, successMessage);
            }
        }
        view.enterToContinue();

    }

    private void cancelReservation() throws DataException {
        List<String> emails = view.getReservationEmails();
        String guestEmail = emails.get(0), hostEmail = emails.get(1);
        Guest guest = guestService.findByGuestEmail(guestEmail);
        List<Reservation> reservations = reservationService.findByHostEmail(hostEmail);
        view.displayGuestReservations(reservations, guest);
        Result<Reservation> result = reservationService.remove(emails);
        if (!result.isSuccess()) {
            view.displayStatus(false, result.getErrorMessages());
        } else {
            String successMessage = "Reservation has been cancelled. Book with us again soon!";
            view.displayStatus(true, successMessage);
        }
        view.enterToContinue();
    }
}
