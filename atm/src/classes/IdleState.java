package classes;

import abstracts.ATMState;

public class IdleState extends ATMState {
    @Override
    public void insertCard() {
        // logic
    }

    @Override
    public void authenticateUsingPin() {}
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
