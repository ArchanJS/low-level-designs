package classes;

import abstracts.Payment;

public class CreditCardPayment extends Payment {
    private String cardNo;
    private String name;
    private String billingAddress;
    private String code;

    @Override
    public boolean makePayment(double amount) {
        // logic
        return true;
    }
}
