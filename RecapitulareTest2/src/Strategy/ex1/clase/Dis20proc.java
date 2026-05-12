package Strategy.ex1.clase;

public class Dis20proc implements Discount{

    protected int disc;

    public Dis20proc() {
        this.disc = 20;
    }

    @Override
    public int calculeazaNota() {
        return disc;
    }
}
