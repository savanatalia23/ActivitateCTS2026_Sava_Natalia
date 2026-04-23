package Facade.SpitalFacade;

import Facade.Clase.Medic;
import Facade.Clase.Pacient;
import Facade.Clase.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        if(pacient.getGravitate()>=4){
            if(this.medic.areBiletDeTrimitere(pacient)){
                int nrPat = this.salon.patLiber();
                if(nrPat!= -1)
                {
                    System.out.println("Pacientul " + pacient.getNume()+ " este internat in patul " + nrPat);
                    this.salon.ocupaPat(nrPat);
                }
                else{
                    System.out.println(" Nu avem paturi libere" );
                }
            }
            else{
                System.out.println("Pacientul "+ pacient.getNume()+ " nu are bilet de trimitere");
            }
        }
        else{
            System.out.println("Nu are gravitatea minima necesara");
        }
    }

}
