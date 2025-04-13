package impl;

import interfaces.Mode;

public class Car implements Mode {
    @Override
    public void getDirection() {
        System.out.println("Take the main road and drive for 10km");
    }

    @Override
    public void getETA() {
        System.out.println("ETA is 15 mins");
    }
}
