package Facade.ex1.main;

import Composite.ex1.clase.Folder;
import Facade.ex1.Clase.Medic;
import Facade.ex1.Clase.Pacient;
import Facade.ex1.Clase.Salon;
import Facade.ex1.Clase.SpitalFacade;

public class Main {
    static void main(String[] args) {

        SpitalFacade facade = new SpitalFacade(new Medic("Popescu"), new Salon());

        facade.interneazaPacient(new Pacient(8, "Natalia"));
    }
}
