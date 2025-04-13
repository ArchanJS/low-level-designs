package classes;

import abstracts.Equipment;
import abstracts.Service;
import abstracts.Vehicle;
import enums.ReservationStatus;

import java.util.Date;
import java.util.List;

public class Reservation {
    private int id;
    private Vehicle vehicle;
    private Customer customer;
    private Date reservationDate;
    private Date dueDate;
    private List<Equipment> equipment;
    private List<Service> services;
    private ReservationStatus status;
    private String pickUpLocation;
    private String returnLocation;
    private Date createdAt;

    public void addEquipment(Equipment equipment){
        // logic
    }

    public void addService(Service service){
        // logic
    }
}
