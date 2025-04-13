package payment.impl;

import payment.interfaces.PaymentMethod;

public class UPI implements PaymentMethod {
    private String UPIId;
    public UPI(String _UPIId){
        this.UPIId = _UPIId;
    }
    
    @Override
    public void pay() {
        System.out.println("Paying for the UPI Id: "+this.UPIId);
    }
}
