package Command.clase.comenzi;

import Command.clase.Pacient;
import Command.clase.personalSpital.PersonalSpital;

public class Tratare implements Command{
    private PersonalSpital asistenta;
    private Pacient pacient;

    public Tratare(PersonalSpital medic, Pacient pacient) {
        this.asistenta = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        asistenta.preluarePacient(pacient);
    }
}
