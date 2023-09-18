public abstract class Hogwarts {
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


    public String getSurname() {
        return surname;
    }


    public int getWitchcraft() {
        return witchcraft;
    }


    public int getTransgress() {
        return transgress;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgress=" + transgress +
                '}';
    }

    public String compareHogwarts(Hogwarts hogwarts) {
        return (witchcraft + transgress) > (hogwarts.getWitchcraft() + hogwarts.getTransgress()) ?
                getName() + " " + getSurname() + " " + "обладает бОльшей мощностью магии, чем" + " " + hogwarts.getName() + " " + hogwarts.getSurname():
                getName() + " " + getSurname() + " " + "обладает меньшей мощностью магии , чем" + " " + hogwarts.getName() + " " + hogwarts.getSurname();

    }
}
