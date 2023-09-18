public class Hufflepuff extends Hogwarts {
    private final int hardWork;
    private final int loyalty;
    private final int honesty;

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

    public String сompareHufflepuff(Hufflepuff hufflepuff) {
        return (hardWork + loyalty + honesty) > (hufflepuff.getHardWork() + hufflepuff.getLoyalty() +
                hufflepuff.getHonesty()) ?
                getName() + "лучший Пуффиндуйец , чем" + hufflepuff.getName():
                getName() + "худший Пуффиндуйец , чем" + hufflepuff.getName();
    }

}

