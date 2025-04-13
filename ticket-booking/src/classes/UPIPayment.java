package classes;

import abstracts.Payment;

public class UPIPayment extends Payment {
    private String UPIId;

    @Override
    public boolean makePayment(double amount) {
        // logic
        return true;
    }
}
