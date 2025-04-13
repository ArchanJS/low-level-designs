import impl.Car;
import impl.DirectionService;

public class Main {
    public static void main(String[] args) {
        DirectionService dir=new DirectionService();
        Car car=new Car();
        dir.setMode(car);
        dir.getDir();
        dir.getETA();
    }
}