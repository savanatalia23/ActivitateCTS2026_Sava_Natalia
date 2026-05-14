package Flweight.Farmacie.clase;

public class Pacient implements IPacient {

    protected String nume;
    protected int nrAsigurare;

    protected Pacient(int nrAsigurare, String nume) {
        this.nrAsigurare = nrAsigurare;
        this.nume = nume;
    }

    @Override
    public void afisareDetalii(Reteta reteta) {
        System.out.println("Pacientul " + this.nume + " are asigurarea cu numarul "+ this.nrAsigurare+ " si are ") ;
        System.out.println(reteta.toString());
    }
}
