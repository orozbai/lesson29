package Task3.movies;

import java.util.*;

public class Overide implements Sortable {
    private final List<Movie> movieList;

    public Overide() {
        movieList = FileServices.readFile();
    }

    @Override
    public void displayMovie() {
        for (var m : movieList) {
            System.out.println(m);
        }
    }

    @Override
    public void movieSearch() {
        List<Movie> movie = FileServices.readFile();
        List<Movie> list = new ArrayList<>(movie);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Искать фильм по названию: ");
        String searchTerm = scanner.nextLine();

        for (Movie v : list) {
            if (v.getName().contains(searchTerm)) {
                System.out.println(v.getName());
            }
        }
    }

    @Override
    public void sortInYearAscending() {
        List<Movie> list = new ArrayList<>(movieList);

        list.sort(Comparator.comparingInt(Movie::getYear));
        for (var v : list) {
            System.out.println(v);
        }
    }

    @Override
    public void sortInNameAscending() {
        List<Movie> list = new ArrayList<>(movieList);

        list.sort(Comparator.comparing(Movie::getName));
        for (var v : list) {
            System.out.println(v);
        }
    }

    @Override
    public void sortInProducerAscending() {
        List<Movie> list = new ArrayList<>(movieList);

        list.sort(Comparator.comparing(Movie::getDirector));
        for (var v : list) {
            System.out.println(v);
        }
    }

    @Override
    public void sortInYearDescending() {
        List<Movie> list = new ArrayList<>(movieList);

        Comparator<Movie> cmp = Comparator.comparing(Movie::getYear);
        list.sort(cmp.reversed());

        for (var v : list) {
            System.out.println(v);
        }
    }

    @Override
    public void sortInNameDescending() {
        List<Movie> list = new ArrayList<>(movieList);

        Comparator<Movie> cmp = Comparator.comparing(Movie::getName);
        list.sort(cmp.reversed());

        for (var v : list) {
            System.out.println(v);
        }
    }

    @Override
    public void sortInProducerDescending() {
        List<Movie> list = new ArrayList<>(movieList);

        Comparator<Movie> cmp = Comparator.comparing(Movie::getDirector);
        list.sort(cmp.reversed());

        for (var v : list) {
            System.out.println(v);
        }
    }

    @Override
    public void searchMovieInName() {
        List<Movie> list = new ArrayList<>(movieList);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Искать все фильмы по имени актера: ");
        String searchTerm = scanner.nextLine();
        Map<Movie, String> map = new HashMap<>();
        System.out.println(map);
        try {
            for (Movie ob : list) {
                for (int i = 0; i < ob.getCasts().size(); i++) {
                    if (ob.getCasts().get(i).getFullName().contains(searchTerm)) {
                        map.put(ob, ob.getName());
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Ошибка пустой файл");
        }
    }
}