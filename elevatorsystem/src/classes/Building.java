package classes;

import java.util.List;

public class Building {
    private List<Floor> floors;
    private List<ElevatorCar> elevatorcars;
    private static Building building = null;
    public static Building getElevatorSystem(){
        if(building == null) building = new Building();
        return building;
    }
}
