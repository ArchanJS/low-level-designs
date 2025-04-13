package classes;

import java.util.List;

public class VendingMachine {
    private int id;
    private double amount;
    private int noOfRacks;
    private List<Rack> lisOfRacks;
    private List<Rack> availableRacks;

    private static VendingMachine vendingMachine = null;

    public VendingMachine getInstance(){
        if(vendingMachine == null) vendingMachine = new VendingMachine();
        return vendingMachine;
    }

    public void insertMoney(int amount){
        // logic
    }
    public void pressButton(int rackNo){
        // logic
    }
    public void returnChange(int amount){
        // logic
    }
    public void updateInventory(int rackNo,int productId){
        // logic
    }
    public void dispenseProduct(int rackNo,int productId){
        // logic
    }

}
