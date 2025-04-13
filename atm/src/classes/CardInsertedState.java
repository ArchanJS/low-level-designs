package classes;

import abstracts.ATMState;

public class CardInsertedState extends ATMState {
    @Override
    public void insertCard() {}
    @Override
    public void authenticateUsingPin() {
        // logic
    }
    @Override
    public void selectOperation() {}
    @Override
    public void checkAccountBalance() {}
    @Override
    public void transferMoney() {}
    @Override
    public void withdrawMoney() {}
    @Override
    public void returnCard() {}
    @Override
    public void exit(){}


}
