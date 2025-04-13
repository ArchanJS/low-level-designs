package classes;

import interfaces.Search;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Catalogue implements Search {
    @Override
    public List<Movie> getMovieByTitle(String title) {
        // logic
        return new ArrayList<>();
    }

    @Override
    public List<Movie> getMovieByGenre(String genre) {
        // logic
        return new ArrayList<>();
    }

    @Override
    public List<Movie> getMovieByLanguage(String language) {
        // logic
        return new ArrayList<>();
    }

    @Override
    public List<Movie> getMovieByReleaseData(Date date) {
        // logic
        return new ArrayList<>();
    }
}
