package classes;

import abstracts.Seat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShowTime {
    private int id;
    private Date showDate;
    private Date showTime;
    private double duration;
    private List<Seat> seats;

    public List<Seat> showAvailableSeats(){
        // logic
        return new ArrayList<>();
    }
}
