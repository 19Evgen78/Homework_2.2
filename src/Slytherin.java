public class Slytherin extends Hogwarts {

    private int cunning;
    private int decisive;
    private int ambitious;
    private int resourceful;
    private int powerful;

    public Slytherin(String name, String surname, int witchcraft, int transgress, int cunning, int decisive, int ambitious, int resourceful, int powerful) {
        super(name, surname, witchcraft, transgress);
        this.cunning = cunning;
        this.decisive = decisive;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.powerful = powerful;
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getDecisive() {
        return this.decisive;
    }

    public int getAmbitious() {
        return this.ambitious;
    }

    public int getResourceful() {
        return this.resourceful;
    }

    public int getPowerful() {
        return this.powerful;
    }

    public static void compareStudents(Slytherin draco, Slytherin gregory) {
        if (draco.getCunning() + draco.getDecisive() + draco.getAmbitious() + draco.getResourceful() + draco.getPowerful() > draco.getCunning() + gregory.getDecisive() + gregory.getAmbitious() + gregory.getResourceful() + gregory.getPowerful()) {
            System.out.println("Драко лучший Слизеринец , чем Грегори");
        } else {
            System.out.println("Грегори лучший Слизеринец , чем Драко");
        }

    }

}
