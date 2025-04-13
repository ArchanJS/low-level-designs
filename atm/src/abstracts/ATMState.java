package abstracts;

public abstract class ATMState {
    public abstract void insertCard();
    public abstract void authenticateUsingPin();
    public abstract void selectOperation();
    public abstract void checkAccountBalance();
    public abstract void transferMoney();
    public abstract void withdrawMoney();
    public abstract void returnCard();
    public abstract void exit();

    // interface segregation principal & strategy pattern can be used to improve code quality
}
