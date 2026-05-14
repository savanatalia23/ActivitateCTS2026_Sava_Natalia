package Facade.ex1.Clase;

public class Medic {
    protected String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean verificaGravitate(Pacient pacient)
    {
        System.out.println("Pacientul poate fi internat");
        return pacient.gravitate>5;
    }
}
