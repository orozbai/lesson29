package Task3.movies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SDSd {

    public static void movieSearch() {
        List<Movie> movie = FileServices.readFile();
        List<Movie> list = new ArrayList<>(movie);

        list.sort(Comparator.comparingInt(Movie::getYear));
        System.out.println(list);
    }
}


