package classes;

import java.util.Date;
import java.util.List;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private String language;
    private Date releaseDate;
    private double duration;
    private List<ShowTime> shows;

    public List<ShowTime> getAllShow(){
        return this.shows;
    }
    public void addShow(ShowTime show){
        shows.add(show);
    }
}
