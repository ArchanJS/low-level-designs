package classes;

import abstracts.ATMState;

public class WithdrawMoneyState extends ATMState {
    @Override
    public void insertCard() {}
    @Override
    public void authenticateUsingPin() {}
    @Override
    public void selectOperation() {}
    @Override
    public void checkAccountBalance() {}
    @Override
    public void transferMoney() {}
    @Override
    public void withdrawMoney() {
        // logic
    }
    @Override
    public void returnCard() {}
    @Override
    public void exit(){}
}
