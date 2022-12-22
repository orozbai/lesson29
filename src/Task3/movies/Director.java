package Task3.movies;

public class Director {
    private String fullName;

    @Override
    public String toString() {
        return "movies.Director{" +
                "fullName='" + fullName + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }
}
