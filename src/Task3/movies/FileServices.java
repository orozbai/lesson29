package Task3.movies;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileServices {
    private static final Gson GSON = new GsonBuilder().create();
    private static final Path PATH = Paths.get("data/movies.json");

    public static List<Movie> readFile() {
        String json = "";
        try {
            json = Files.readString(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(json, CollectionMovie.class).getMovieList();
    }
}
