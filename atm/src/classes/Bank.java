package classes;

import java.util.List;

public class Bank {
    private String bankName;
    private String bankCode;

    private List<ATM> atms;

    public void getBankCode(){
        // logic
    }

    public void addATM(ATM atm){
        atms.add(atm);
    }
}
