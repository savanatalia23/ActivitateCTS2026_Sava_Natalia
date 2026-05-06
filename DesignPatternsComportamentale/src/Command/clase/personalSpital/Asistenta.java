package Command.clase.personalSpital;

import Command.clase.Pacient;

public class Asistenta implements PersonalSpital{

    private String name;

    public Asistenta(String name) {
        this.name = name;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.printf("Asistenta " + this.name + " trateaza imediat pacientul " + pacient.getNume()+ "\n");

    }
}
