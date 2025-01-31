import java.util.ArrayList;

public class Movie {

    private int id = 0;
    private String name = "Undefined";
    private String category = "Undefined";
    private String duration = "Undefined";

    public Movie(MovieBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.category = builder.category;
        this.duration = builder.duration;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public static class MovieBuilder {

        private int id = 0;
        private String name = "Undefined";
        private String category = "Undefined";
        private String duration = "Undefined";

        public MovieBuilder(int id, String name, String category, String duration) {
            this.id = id;
            this.name = name;
            this.category = category;
            this.duration = duration;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
}