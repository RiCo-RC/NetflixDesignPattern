import java.util.AbstractList;
import java.util.ArrayList;

public class MovieList {

    private ArrayList<Movie> listOfMovie = new ArrayList<Movie>();

    public MovieList() {
        this.listOfMovie = new ArrayList<Movie>();
    }

    public void addMovie(Movie movie) {
        this.listOfMovie.add(movie);
    }

    public ArrayList<Movie> getAllMovie() {
        return this.listOfMovie;
    }
}
