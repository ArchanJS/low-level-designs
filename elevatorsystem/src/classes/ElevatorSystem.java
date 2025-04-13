package classes;

public class ElevatorSystem {
    private Building building;
    private static ElevatorSystem elevatorSystem;
    public static ElevatorSystem getElevatorSystem(){
        if(elevatorSystem == null) elevatorSystem=new ElevatorSystem();
        return elevatorSystem;
    }
    public void monitor(){
        // logic
    }
    public void dispatch(){
        // logic
    }
}
