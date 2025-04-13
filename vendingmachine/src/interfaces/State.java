package interfaces;

public interface State {
    public void insertMoney(int amount);
    public void pressButton(int rackNo);
    public void returnChanges(int amount);
    public void updateInvenory(int rackNo,int productId);
    public void dispenseProduct(int rackNo,int productId);
}
