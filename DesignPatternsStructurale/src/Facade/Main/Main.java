package Facade.Main;

import Facade.Clase.Medic;
import Facade.Clase.Pacient;
import Facade.Clase.Salon;
import Facade.SpitalFacade.SpitalFacade;

public class Main {
    static void main(String[] args) {

        Pacient pacient1 = new Pacient(7, "Natalia");
        Pacient pacient2 = new Pacient(5, "Ioana");
        Pacient pacient3 = new Pacient(3, "Ioana");

        Medic medic = new Medic(" Andreea");
        Salon salon = new Salon();

//        if(pacient.getGravitate()>=4){
//            if(medic.areBiletDeTrimitere(pacient)){
//                int nrPat = salon.patLiber();
//                if(nrPat!= -1)
//                {
//                    System.out.println("Pacientul " + pacient.getNume()+ " este internat in patul " + nrPat);
//                    salon.ocupaPat(nrPat);
//                }
//                else{
//                    System.out.println(" Nu a putut fi internat" );
//                }
//            }
//        }

        SpitalFacade facade = new SpitalFacade(new Medic("Maria"), new Salon());

        facade.interneazaPacient(pacient1);
        facade.interneazaPacient(pacient2);
        facade.interneazaPacient(pacient3);


    }
}
