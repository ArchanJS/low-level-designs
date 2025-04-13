import impl.CreditCard;
import impl.PaymentMethod;
import impl.UPI;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        PaymentMethod payemtMathod=new PaymentMethod();
        payemtMathod.setPaymentMethod(new UPI());
        payemtMathod.pay();
    }
}