package impl;

import interfaces.PaymentStrategy;

public class PaymentMethod {
    private PaymentStrategy strategy;
//    public PaymentMethod(PaymentStrategy strategy){
//        this.strategy=strategy;
//    }
    public void setPaymentMethod(PaymentStrategy strategy){
        this.strategy=strategy;
    }
    public void pay(){
        this.strategy.processPayment();
    }
}
