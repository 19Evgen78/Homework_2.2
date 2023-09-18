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

    public String compareSlythering(Slytherin slytherin) {
        return (cunning + decisive + ambitious + resourceful +powerful) > (slytherin.getCunning() +
                slytherin.getDecisive() + slytherin.getAmbitious() +slytherin.getResourceful() +
                slytherin.getPowerful()) ?
                getName() + "лучший Слизеринец, чем" + slytherin.getName():
                getName() + "худший Слизеринец, чем" + slytherin.getName();

    }

}
