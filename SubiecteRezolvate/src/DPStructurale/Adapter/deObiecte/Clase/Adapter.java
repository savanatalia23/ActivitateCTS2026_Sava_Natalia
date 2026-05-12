package DPStructurale.Adapter.deObiecte.Clase;

public class Adapter extends Farmacie  {

    Spital spital;

    public Adapter(String nume, Spital spital) {
        super(nume);
        this.spital = spital;
    }


    public void afiseazaSpital() {
        spital.afiseazaSpital();
    }
}
