package DPStructurale.Adapter.deClase.Clase;

public class Farmacie {

    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void afiseazaFarmacie()
    {
        System.out.println("Am afisat obiectul " + this.nume+ " de tip FARMACIE");
    }
}
