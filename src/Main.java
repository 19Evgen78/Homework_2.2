import java.util.concurrent.atomic.AtomicReference;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Hogwarts[] hogwarts = {
                        new Gryffindor("Гарри", "Поттер", 60, 70, 50, 80, 90),
                        new Gryffindor("Гермиона", "Грейнджер", 90, 90, 50, 60, 70),
                        new Gryffindor("Рон", "Уизли", 80, 70, 60, 50, 90),

            new Slytherin("Драко", "Малфой", 60, 70, 50, 60, 65, 55, 70),
            new Slytherin("Грэхэм", "Монтегрю", 60, 50, 40, 70, 80, 55, 45),
            new Slytherin("Грегори", "Гойл", 50, 60, 55, 45, 70, 75, 40),

            new Hufflepuff("Захария", "Смит", 60, 40, 50, 45, 55),
            new Hufflepuff("Седрик", "Диггори", 50, 60, 60, 45, 70),
            new Hufflepuff("Джастин", "Финч-Флетчли", 20, 10, 30, 40, 50),

            new Ravenclaw("Чжоу", "Чанг", 50, 60, 40, 60, 50, 20),
            new Ravenclaw("Падма", "Патил", 60, 40, 45, 55, 65, 50),
            new Ravenclaw("Маркус", "Белби", 55, 45, 35, 60, 70, 40),
            };

            Hogwarts hogwart = hogwarts[0];
            Hogwarts hogwarts1 = hogwarts[1];
            hogwart.compareHogwarts(hogwarts1);

            System.out.println(hogwart.compareHogwarts(hogwarts1));




    }
}