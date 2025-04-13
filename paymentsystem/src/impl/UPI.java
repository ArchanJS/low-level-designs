package impl;

import interfaces.PaymentStrategy;

public class UPI implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Paying using UPI");
    }
}
