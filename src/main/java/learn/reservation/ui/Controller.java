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
import java.util.ArrayList;
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
                case VIEW_RESERVATIONS_FOR_GUEST:
                    viewByGuest();
                    break;
                case VIEW_RESERVATIONS_BY_STATE:
                    viewByState();
                    break;
            }
        } while (option != MainMenuOption.EXIT);
    }

    private void viewByState() throws DataException{
        String state = view.getState();
        List<Reservation> reservations = new ArrayList<>();
        List<Guest> guests = new ArrayList<>();
        try{
            reservations = reservationService.findByState(state);
            guests = guestService.findAllGuests();
            view.displayHostReservations(reservations, guests);
        }
        catch (NullPointerException ex){
            String message = "Invalid email entry or state does not exit in registry";
            view.displayStatus(false,message);
        }
        view.enterToContinue();
    }

    private void viewByGuest() {
        String email = view.getGuestEmail();
        List<Reservation> reservations = new ArrayList<>();
        Guest guest = new Guest();
        try {
            reservations = reservationService.findByGuestEmail(email);
            guest = guestService.findByGuestEmail(email);
            view.displayReservationsforGuest(reservations, guest);
        }
        catch (NullPointerException | DataException ex){
            String message = "Invalid email entry. Please confirm the email address provided";
            view.displayStatus(false,message);
        }
        view.enterToContinue();
    }

    private void viewByHost() throws DataException {
        String email = view.getHostEmail();
        List<Reservation> reservations = new ArrayList<>();
        List<Guest> guests = new ArrayList<>();
        try {
            reservations = reservationService.findByHostEmail(email);
            guests = guestService.findAllGuests();
            view.displayHostReservations(reservations, guests);
        }
        catch (NullPointerException ex){
            String message = "Invalid email entry. Please confirm the email addresses provided";
            view.displayStatus(false,message);
        }
        view.enterToContinue();
    }

    private void makeReservation() throws DataException {
        List<String> emails = view.getReservationEmails("make");
        String guestEmail = emails.get(0), hostEmail = emails.get(1);
        List<Reservation> reservations = new ArrayList<>();
        List<Guest> guests = new ArrayList<>();
        try {
            reservations = reservationService.findByHostEmail(hostEmail);
            guests = guestService.findAllGuests();
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
        }
        catch (NullPointerException ex){
            String message = "Invalid email entry. Please confirm the email addresses provided";
            view.displayStatus(false,message);
        }
        view.enterToContinue();
    }

    private void editReservation() throws DataException {
        try {
            List<String> emails = view.getReservationEmails("edit");
            String guestEmail = emails.get(0), hostEmail = emails.get(1);
            Guest guest = guestService.findByGuestEmail(guestEmail);
            List<Reservation> reservations = reservationService.findByHostEmail(hostEmail);
            int reservationId = view.displayGuestReservations(reservations, guest);
            List<LocalDate> dates = view.getReservationDates();
            BigDecimal total = hostService.getTotal(hostEmail, dates);

            char response = view.displayReservationReport(dates, total);
            if (response == 'y') {
                Reservation toUpdate = makeUpdate(reservationId, dates, total);
                Result<Reservation> result = reservationService.update(toUpdate, hostService.findByEmail(hostEmail).getId());
                if (!result.isSuccess()) {
                    view.displayStatus(false, result.getErrorMessages());
                } else {
                    String successMessage = "Update was successful";
                    view.displayStatus(true, successMessage);
                }
            }
        }
        catch (NullPointerException ex){
            String message = "Invalid email entry. Please confirm the email addresses provided";
            view.displayStatus(false,message);
        }
        view.enterToContinue();

    }

    private void cancelReservation() throws DataException {
        try {
            List<String> emails = view.getReservationEmails("cancel");
            String guestEmail = emails.get(0), hostEmail = emails.get(1);
            Guest guest = guestService.findByGuestEmail(guestEmail);
            List<Reservation> reservations = reservationService.findByHostEmail(hostEmail);
            int reservationId = view.displayGuestReservations(reservations, guest);
            Result<Reservation> result = reservationService.remove(reservationId, hostService.findByEmail(hostEmail).getId());
            if (!result.isSuccess()) {
                view.displayStatus(false, result.getErrorMessages());
            } else {
                String successMessage = "Reservation has been cancelled. Book with us again soon!";
                view.displayStatus(true, successMessage);
            }
        }
        catch (NullPointerException ex){
            String message = "Invalid email entry. Please confirm the email addresses provided";
            view.displayStatus(false,message);
        }
        view.enterToContinue();
    }

    private Reservation makeUpdate(int id, List<LocalDate> dates, BigDecimal total)
    {
        Reservation reservation = new Reservation();
        reservation.setId(id);
        reservation.setStartDate(dates.get(0));
        reservation.setEndDate(dates.get(1));
        reservation.setTotal(total);
        return reservation;
    }

}
