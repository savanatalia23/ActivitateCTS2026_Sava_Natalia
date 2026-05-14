package Facade.ex1.Clase;

public class SpitalFacade {
    protected  Medic medic;
    protected Salon salon;

    public SpitalFacade(Medic medic,  Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        pacient.afisareGraviate();
        medic.verificaGravitate(pacient);
        salon.ocuparePat();
    }
}
