package DPComportamentale.Comand.ex3.clase;

public class Interneaza implements Command{

    protected Medic medic;
    protected Pacient pacient;

    public Interneaza(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void spitalizare() {
        medic.preluarePacient(pacient);
    }
}
