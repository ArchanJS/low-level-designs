package classes;

import abstracts.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receptionist extends User {
    private Date joiningDate;

    public List<Customer> searchCustomer(String name){
        // logic
        return new ArrayList<>();
    }

    public boolean createReservation() {
        // logic
        return true;
    }

    public boolean cancelReservation() {
        // logic
        return true;
    }
}
