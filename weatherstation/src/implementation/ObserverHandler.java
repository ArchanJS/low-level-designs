package implementation;

import interfaces.Handler;
import interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverHandler implements Handler {
    private List<Observer> Observers;
    private float temperature;

    public ObserverHandler(){
        this.Observers=new ArrayList<>();
    }

    @Override
    public void addObserver(Observer ob) {
        Observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        Observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob:Observers){
            ob.update(this.temperature);
        }
    }

    public void setTemperature(float temperature){
        this.temperature=temperature;
        this.notifyObservers();
    }
}
