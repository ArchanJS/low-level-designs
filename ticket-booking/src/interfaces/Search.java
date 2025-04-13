package interfaces;

import classes.Movie;

import java.util.Date;
import java.util.List;

public interface Search {
    public List<Movie> getMovieByTitle(String title);
    public List<Movie> getMovieByGenre(String genre);
    public List<Movie> getMovieByLanguage(String language);
    public List<Movie> getMovieByReleaseData(Date date);
}
