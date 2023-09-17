public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname, int witchcraft, int transgress, int smart, int wise, int witty, int creative) {
        super(name, surname, witchcraft, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return this.smart;
    }

    public int getWise() {
        return this.wise;
    }

    public int getWitty() {
        return this.witty;
    }

    public int getCreative() {
        return this.creative;
    }

    public static void compareStudents(Ravenclaw zhou, Ravenclaw padma) {
        if (zhou.getSmart() + zhou.getWise() + zhou.getWitty() + zhou.getCreative() > padma.getSmart() + padma.getWise() + padma.getWitty() + padma.getCreative()) {
            System.out.println("Чжоу лучший Когтевранец , чем Падма");
        } else {
            System.out.println("Падма лучший Когтевранец , чем Чжоу");
        }
    }
}
