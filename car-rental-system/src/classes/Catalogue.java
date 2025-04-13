package classes;

import abstracts.Vehicle;
import interfaces.Search;

import java.util.HashMap;
import java.util.List;

public class Catalogue implements Search {
    @Override
    public HashMap<String, List<Vehicle>> getVehicleByModel(String model) {
        // logic
        return null;
    }

    @Override
    public HashMap<String, List<Vehicle>> getVehiclesByType(String type) {
        // logic
        return null;
    }
}
