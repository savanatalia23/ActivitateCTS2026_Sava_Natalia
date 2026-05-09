package DPComportamentale.Strategy.ex2.clase;

public class CardCalatorii implements TipDePlata {

    protected  String nume;

    public CardCalatorii(String nume) {
        this.nume = nume;
    }
    public CardCalatorii() {
        this.nume = "Nominal";
    }

    @Override
    public void plateste() {
        System.out.println("S-a efectuat  plata prin Cardul de calatorie de tipul " + this.nume);
    }
}
