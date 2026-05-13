package Composite.ex1.clase;

public abstract class Structura {

    protected String nume;

    public Structura(String nume) {
        this.nume = nume;
    }

    public abstract void afisare(String spati);
}
