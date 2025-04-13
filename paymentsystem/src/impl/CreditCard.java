package impl;

import interfaces.PaymentStrategy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Paying using Credit card");
    }
}
