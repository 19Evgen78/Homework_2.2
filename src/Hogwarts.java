public class Hogwarts {
    private String name;
    private String surname;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String name, String surname, int witchcraft, int transgress) {
        this.name = name;
        this.surname = surname;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public static void compareAnyStudents(Gryffindor harry, Slytherin draco) {
        if (harry.getWitchcraft() + harry.getTransgress() > draco.getWitchcraft() + draco.getTransgress()) {
            System.out.println("Гарри Поттер обладает большей мощностью магии , чем Драко Малфой");
        } else {
            System.out.println("Драко Малфой обладает большей мощностью магии , чем Гарри Поттер");
        }
    }
}
