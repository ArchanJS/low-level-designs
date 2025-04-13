package classes;

import interfaces.State;

public class MoneyInsertedState implements State {
    @Override
    public void insertMoney(int amount) {
        // logic
    }
    @Override
    public void pressButton(int rackNo) {
        // logic
    }
    @Override
    public void returnChanges(int amount) {
        // logic
    }
    @Override
    public void updateInvenory(int rackNo,int productId) {
        // logic
    }
    @Override
    public void dispenseProduct(int rackNo,int productId) {
        // logic
    }
}
