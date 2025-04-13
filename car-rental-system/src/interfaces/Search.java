package interfaces;

import abstracts.Vehicle;

import java.util.HashMap;
import java.util.List;

public interface Search {
    public HashMap<String, List<Vehicle>> getVehiclesByType(String type);
    public HashMap<String, List<Vehicle>> getVehicleByModel(String model);
}
