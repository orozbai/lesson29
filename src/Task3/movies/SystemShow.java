package Task3.movies;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SystemShow {
    public static void showInterface() {
        System.out.println("Что хотите сделать?");
        showSwitch();
    }

    public static String showSwitch() {
        System.out.println("0. Exit\n1. Выводить коллекцию фильмов на экран\n" +
                "2. Искать и отображать фильмы по полному и частичному совпадению в названии\n" +
                "3. (33 убывание) Сортировка по году\n4. (44 убывание) По Названию\n5. (55 убыванию) По Режиссеру\n" +
                "Вторая часть Тз не реализовано" +
                "6. Поиск всех фильмов по имени Актера\n");
        Scanner sc = new Scanner(System.in);
        Overide overide = new Overide();
        try {
            int num = sc.nextInt();
            switch (num) {
                case 0:
                    System.exit(0);
                case 1:
                    overide.displayMovie();
                    return showSwitch();
                case 2:
                    overide.movieSearch();
                    return showSwitch();
                case 3:
                    overide.sortInYearAscending();
                    return showSwitch();
                case 4:
                    overide.sortInNameAscending();
                    return showSwitch();
                case 5:
                    overide.sortInProducerAscending();
                    return showSwitch();
                case 33:
                    overide.sortInYearDescending();
                    return showSwitch();
                case 44:
                    overide.sortInNameDescending();
                    return showSwitch();
                case 55:
                    overide.sortInProducerDescending();
                    return showSwitch();
                case 6:
                    overide.searchMovieInName();
                    return showSwitch();
                default:
                    System.out.println("Не корректное число");
                    return showSwitch();
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка не корректный ввод");
            return showSwitch();
        }
    }
}
