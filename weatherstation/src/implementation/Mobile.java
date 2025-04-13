package implementation;

import interfaces.Observer;

public class Mobile implements Observer {
    private String name;
    public Mobile(String name){
        this.name=name;
    }
    @Override
    public void update(float temperature) {
        System.out.println("temperature for "+this.name+": "+temperature);
    }
}
