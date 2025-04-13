package classes;

import abstracts.Payment;

public class CreditCard extends Payment {
    private String cardNo;
    private String expiryDate;
    private String code;
    private String name;

    @Override
    public boolean pay() {
        // logic
        return true;
    }
}
