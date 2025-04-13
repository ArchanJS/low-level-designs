import implementation.ObserverHandler;
import implementation.Mobile;
import implementation.Tab;

public class Main {
    public static void main(String[] args) {
        ObserverHandler handler=new ObserverHandler();
        Mobile mobile=new Mobile("Vivo");
        Tab tab=new Tab("IPad");

        handler.addObserver(mobile);
        handler.addObserver(tab);

        handler.setTemperature((float)30.5);

        handler.removeObserver(mobile);

        handler.setTemperature((float)22);
    }
}