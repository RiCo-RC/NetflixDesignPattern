public class Request {

    private int id = 0;
    private ERequestType typeModification = ERequestType.CREATE;
    private String commentary = "Undefined";
    private String timestamps = "31-01-2025 00:00:00";
    private String autor = "Undefined";
    private Movie movie;

    public Request() {
        this.id = id;
        this.typeModification = typeModification;
        this.timestamps = timestamps;
        this.commentary = commentary;
        this.autor = autor;
        this.movie = movie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ERequestType getTypeModification() {
        return typeModification;
    }

    public void setTypeModification(ERequestType typeModification) {
        this.typeModification = typeModification;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(String timestamps) {
        this.timestamps = timestamps;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
