

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int witchcraft, int transgress,
                      int nobility, int honor, int bravery) {
        super(name, surname, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }


    public int getHonor() {
        return honor;
    }


    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public String compareGryffindor(Gryffindor gryffindor) {
        return (nobility + honor + bravery) > (gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery()) ?
                getName() + "лучший Гриффиндорец, чем " + gryffindor.getName():
                getName() + "худший Гриффиндорец, чем" + gryffindor.getName();

    }

}
