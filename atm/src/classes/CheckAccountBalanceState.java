package classes;

import abstracts.ATMState;

public class CheckAccountBalanceState extends ATMState {
    @Override
    public void insertCard() {}
    @Override
    public void authenticateUsingPin() {}
    @Override
    public void selectOperation() {}
    @Override
    public void checkAccountBalance() {
        // logic
    }
    @Override
    public void transferMoney() {}
    @Override
    public void withdrawMoney() {}
    @Override
    public void returnCard() {}
    @Override
    public void exit(){}
}
