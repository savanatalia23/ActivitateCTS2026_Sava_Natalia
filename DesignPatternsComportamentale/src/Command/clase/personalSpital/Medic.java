package Command.clase.personalSpital;

import Command.clase.Pacient;

public class Medic implements PersonalSpital{
    private String name;

    public Medic(String name) {
        this.name = name;
    }
    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.printf("Medicul " + this.name + " interneaza pacientul " + pacient.getNume() + "\n");
    }
}
