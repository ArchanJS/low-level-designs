package impl;

import interfaces.Mode;

public class DirectionService {
    private Mode mode;
    public void setMode(Mode mode){
        this.mode=mode;
    }
    public void getDir(){
        this.mode.getDirection();
    }
    public void getETA(){
        this.mode.getETA();
    }
}
