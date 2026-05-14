package Composite.Farmacie.clase;

public class Medicament implements Structura{

    protected String nume;
    protected  int pret;

    public Medicament(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void afisaredetalii(String spatii) {
        System.out.println(spatii + " Medicamentul " + this.nume + " are pretul " + this.pret + " lei.");
    }
}
