package abstracts;

import enums.SeatStatus;

public abstract class Seat {
    private int seatNo;
    private double price;
    private SeatStatus availability;
    public abstract void setPrice(double price);
    public boolean isAvailable(){
        // logic
        return false;
    }

}
