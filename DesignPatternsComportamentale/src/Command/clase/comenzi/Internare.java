package Command.clase.comenzi;

import Command.clase.Pacient;
import Command.clase.personalSpital.PersonalSpital;

public class Internare implements Command{

    private PersonalSpital medic;
    private Pacient pacient;

    public Internare(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(pacient);
    }
}
