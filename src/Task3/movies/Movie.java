package Task3.movies;

import java.util.List;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> casts;

    public List<Cast> getCasts() {
        return casts;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public String getDirector() {
        return director.getFullName();
    }

    @Override
    public String toString() {
        return String.format("Название %s, Год %d, Описание %s, Режиссер: %s", name, year, description, director.getFullName());
    }

    @Override
    public int compareTo(Movie o) {
        if(this.getName().equals(o.getName())) {
            return this.getName().compareTo(o.getName());
        }
        return this.getName().compareTo(o.getName());
    }
}