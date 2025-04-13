package implementation;

import interfaces.Observer;

public class Tab implements Observer {
    private String name;
    public Tab(String name){
        this.name=name;
    }
    @Override
    public void update(float temperature) {
        System.out.println("temperature for :"+this.name+": "+temperature);
    }
}
