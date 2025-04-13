package abstracts;

import classes.VehicleLog;
import enums.VehicleStatus;
import enums.VehicleType;

import java.util.List;

public abstract class Vehicle {
    private int id;
    private String model;
    private String capacity;
    private String noPlate;
    private String hasSunRoof;
    private int mileage;
    private int manufacturingYear;
    private VehicleStatus vehicleStatus;
    private double price;
    private List<VehicleLog> logs;

    public boolean reserveVehicle(){
        // logic
        return true;
    }

    public boolean returnVehicle(){
        // logic
        return true;
    }
}
