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

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static void printDescriptionStudent(Gryffindor gryffindor) {
        System.out.println(gryffindor.getName() + " " + gryffindor.getSurname() + " " + gryffindor.getWitchcraft()
                + " " + gryffindor.getTransgress() + " " + gryffindor.getNobility() + " " + gryffindor.getHonor()
                + " " + gryffindor.getBravery());
    }

    public static void compareStudents(Gryffindor harry, Gryffindor ron) {
        if (harry.getNobility() + harry.getHonor() + harry.getBravery() > ron.getNobility() +
                ron.getHonor() + ron.getBravery()) {
            System.out.println("Гарри лучший Гриффиндорец , чем Рон");
        }else {
            System.out.println("Рон лучший Гриффиндорец , чем Гарри");
        }
    }
}
