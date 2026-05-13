package Decorater.ex1.clase;


public class ExtrasContLei implements IExtrasCont {

    protected String titular;
    protected int nrTranzactii;

    public ExtrasContLei(int nrTranzactii, String titular) {
        this.nrTranzactii = nrTranzactii;
        this.titular = titular;
    }

    @Override
    public void genereazaExtras() {
        System.out.println("Titularul " + this.titular + " mai are disponibile "+this.nrTranzactii+ " tranzactii pentru contul in lei");
    }
}
