package classes;

import java.util.List;

public class City {
    private int id;
    private City city;
    private String cityName;
    private String pinCode;
    private List<Cinema> cinemas;
    private List<Cinema> getAllCinema(Cinema cinema){
        return this.cinemas;
    }
    private void addCinema(Cinema cinema){
        cinemas.add(cinema);
    }
}
