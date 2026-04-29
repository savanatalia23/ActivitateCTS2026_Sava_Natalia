package Composite.Clase;

public class Sectie implements Structura{

    private int nrAngajati;
    private String nume;


    public Sectie(int nrAngajati, String nume) {
        this.nrAngajati = nrAngajati;
        this.nume = nume;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume sectie: "+ this.nume+ " are "+ this.nrAngajati+" angajati");
    }
}
