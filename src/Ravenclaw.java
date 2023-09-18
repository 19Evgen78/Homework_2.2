public class Ravenclaw extends Hogwarts {
    private final int smart;
    private final int wise;
    private final int witty;
    private final int creative;

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

    public String compareRavenclaw(Ravenclaw ravenclaw) {
        return (smart + wise + witty + creative) > (ravenclaw.getSmart() + ravenclaw.getWise() +
                ravenclaw.getWitty() + ravenclaw.getCreative()) ?
            getName() + "лучший Когтевранец , чем" + ravenclaw.getName():
            getName() + "худший Когтевранец , чем" + ravenclaw.getName();
    }
}
