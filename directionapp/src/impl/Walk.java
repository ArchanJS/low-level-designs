package impl;

import interfaces.Mode;

public class Walk implements Mode {
    @Override
    public void getDirection() {
        System.out.println("Walk straight for the next 10km");
    }

    @Override
    public void getETA() {
        System.out.println("ETA is 45 mins");
    }
}
