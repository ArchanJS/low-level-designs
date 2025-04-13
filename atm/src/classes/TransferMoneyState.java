package classes;

import abstracts.ATMState;

public class TransferMoneyState extends ATMState {
    @Override
    public void insertCard() {}
    @Override
    public void authenticateUsingPin() {}
    @Override
    public void selectOperation() {}
    @Override
    public void checkAccountBalance() {}
    @Override
    public void transferMoney() {
        // logic
    }
    @Override
    public void withdrawMoney() {}
    @Override
    public void returnCard() {}
    @Override
    public void exit(){}
}
