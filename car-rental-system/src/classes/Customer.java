package classes;

import abstracts.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends User {
    private String licenseNo;
    private Date licenseExpiry;

    public boolean createBooking(){
        // logic
        return true;
    }

    public boolean cancelReservation(){
        // logic
        return true;
    }

    public List<Reservation> getAllReservation(){
        // logic
        return new ArrayList<>();
    }
}
