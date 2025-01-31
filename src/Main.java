import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MovieList movieList = new MovieList();

        Movie m1 = new Movie.MovieBuilder(0, "m1", "m1", "01:00:00").build();
        Movie m2 = new Movie.MovieBuilder(1, "m2", "m2", "01:00:00").build();
        Movie m3 = new Movie.MovieBuilder(2, "m3", "m3", "01:00:00").build();

        System.out.println(m1);
        System.out.println(m1.getId());
        System.out.println(m2);
        System.out.println(m2.getId());
        System.out.println(m3);
        System.out.println(m3.getId());
    }
}