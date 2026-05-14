package Facade.ex1.Clase;

public class Pacient {
    protected  int gravitate;
    protected String nume;

    public Pacient(int gravitate, String nume) {
        this.gravitate = gravitate;
        this.nume = nume;
    }
    public void afisareGraviate()
    {
        System.out.println("Pacientul cu numele " +this.nume+ " are gravitatea " + this.gravitate);
    }
}
