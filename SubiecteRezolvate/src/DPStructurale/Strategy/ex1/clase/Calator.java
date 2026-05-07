package DPStructurale.Strategy.ex1.clase;

public class Calator {

    private TipDePlata tipDePlata;
    private String nume;

    public void setModalitateDePlata(TipDePlata tipDePlata) {
        this.tipDePlata = tipDePlata;
    }

    public Calator( String nume) {
        this.tipDePlata = new CardCalatorii();
        this.nume = nume;
    }
    public void efectuarePlata(){
        tipDePlata.plateste();
    }
}
