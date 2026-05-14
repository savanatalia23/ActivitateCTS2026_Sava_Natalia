package Command.farmacie.clase;

public class Farmacist {
    protected String nume;

    public Farmacist(String nume) {
        this.nume = nume;
    }

    public void preiaReteta(Reteta reteta)
    {
        System.out.println("Farmacistul " + this.nume+ " a preluat reteta " + reteta.afisare());
    }


}
