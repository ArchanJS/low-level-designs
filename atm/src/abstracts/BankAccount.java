package abstracts;

public abstract class BankAccount {
    private String accountNumber;
    private double totalBalance;
    private Double availableBalance;

    public double getAvailableBalance(){
        return this.getAvailableBalance();
    }

    public abstract void setWithdrawLimit(double amount);
}
