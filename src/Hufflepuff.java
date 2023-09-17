public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int witchcraft, int transgress, int hardWork, int loyalty, int honesty) {
        super(name, surname, witchcraft, transgress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return this.hardWork;
    }

    public int getLoyalty() {
        return this.loyalty;
    }

    public int getHonesty() {
        return this.honesty;
    }

    public static void сompareStudents(Hufflepuff cedric, Hufflepuff justin) {
        if (cedric.getHardWork() + cedric.getLoyalty() + cedric.getHonesty() > justin.getHardWork() + justin.getLoyalty() + justin.getHonesty()) {
            System.out.println("Седрик лучший Пеффендуйец , чем Джастин");
        } else {
            System.out.println("Джастин лучший Пеффендуйец , чем Седрик");
        }

    }
}
