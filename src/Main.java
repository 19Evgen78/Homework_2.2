// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Gryffindor harry = new Gryffindor("Гарри", "Поттер" ,60 ,70 , 50 ,80 ,90);
            Gryffindor hermyona = new Gryffindor("Гермиона", "Грейнджер" ,90 ,90 ,50 ,60, 70);
            Gryffindor ron = new Gryffindor("Рон", "Уизли" ,80 ,70 ,60 ,50 ,90);

            Slytherin drako = new Slytherin("Драко", "Малфой" ,60 ,70 ,50 ,60 ,65 ,55 ,70);
            Slytherin graham = new Slytherin("Грэхэм", "Монтегрю",60 ,50 ,40 ,70 ,80 ,55 ,45);
            Slytherin gregory = new Slytherin("Грегори", "Гойл" ,50 ,60 ,55 ,45 ,70 ,75 ,40);

            Hufflepuff zacharias = new Hufflepuff("Захария", "Смит" ,60 ,40 ,50 ,45 ,55);
            Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори" ,50 ,60 ,60 ,45 ,70);
            Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли" ,20 ,10 ,30 ,40 ,50);

            Ravenclaw zhoy = new Ravenclaw ("Чжоу", "Чанг" ,50 ,60 ,40 ,60 ,50 ,20);
            Ravenclaw padma = new Ravenclaw("Падма", "Патил", 60 ,40 ,45 ,55 ,65 ,50 );
            Ravenclaw marcus = new Ravenclaw("Маркус", "Белби",55 ,45 ,35 ,60 ,70 ,40);

            Gryffindor.printDescriptionStudent(harry);

            Gryffindor.compareStudents(harry, ron);

            Ravenclaw.compareStudents(zhoy , padma);

            Slytherin.compareStudents(drako , gregory);

            Hufflepuff.сompareStudents( cedric , justin);

            Hogwarts.compareAnyStudents(harry , drako);
        }
}