package payment;
import java.util.*;

import payment.impl.CreditCard;
import payment.impl.DebitCard;
import payment.impl.UPI;
import payment.interfaces.PaymentMethod;

public class Main {
    public static void main(String[] args) {
       PaymentMethod creditCard = new CreditCard("123456789012"); 
       PaymentMethod debitCard = new DebitCard("098765432123"); 
       PaymentMethod UPI = new UPI("randomguy@abc");

       HashMap<String,PaymentMethod> payments = new HashMap<>();

       payments.put("creditCard", creditCard);
       payments.put("debitCard", debitCard);
       payments.put("UPI", UPI);

       for(PaymentMethod method : payments.values()) {
        method.pay();
       }
    }
}
