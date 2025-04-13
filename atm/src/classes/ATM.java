package classes;

import abstracts.ATMState;

public class ATM {
    private int id;
    private Bank bank;
    private ATMState atmState;
    private double currentBalance;
    private int noOfHundreds;
    private int noOfTwoHundreds;
    private int noOfFiveHundreds;;

    public ATMState displayCurrentState(){
        return this.atmState;
    }

    public void initializeAtm(){
        // logic
    }
}
