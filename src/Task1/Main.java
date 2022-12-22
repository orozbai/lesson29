package Task1;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Task1.Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getBreed));
        Printer.print(cats);

        cats.sort(((c1, c2) -> c1.getBreed().compareTo(c2.getBreed())));
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));
        Printer.print(cats);

        cats.sort((o1, o2) -> {
            int comp = o1.getName().compareTo(o2.getName());
            if (comp != 0) {
                return comp;
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        Printer.print(cats);

        cats.removeIf(cat -> cat.getColor().equals(Cat.Color.GRAY));
        Printer.print(cats);

        cats.removeIf(s -> s.getName().length() == 5);
        Printer.print(cats);
    }


}
