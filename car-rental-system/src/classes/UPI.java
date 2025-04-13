package classes;

import abstracts.Payment;

public class UPI extends Payment {
    private String UPIId;

    @Override
    public boolean pay() {
        // logic
        return true;
    }
}
