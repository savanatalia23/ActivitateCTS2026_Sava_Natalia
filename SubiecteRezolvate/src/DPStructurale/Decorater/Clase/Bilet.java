package DPStructurale.Decorater.Clase;

public class Bilet implements IBilet{

    protected int nrBilet;
    protected String titular;

    public Bilet(int nrBilet, String titular) {
        this.nrBilet = nrBilet;
        this.titular = titular;
    }

    @Override
    public String printeza() {
        return this.titular + " are biletul cu numarul " + this.nrBilet;
    }
}
