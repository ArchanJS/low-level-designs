package classes;

import abstracts.ATMState;

public class SelectOperationState extends ATMState {
    @Override
    public void insertCard() {}
    @Override
    public void authenticateUsingPin() {}
    @Override
    public void selectOperation() {
        // logic
    }
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
