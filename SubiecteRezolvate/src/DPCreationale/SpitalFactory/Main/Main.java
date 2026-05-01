package DPCreationale.SpitalFactory.Main;


import DPCreationale.SpitalFactory.Clase.Asistent;
import DPCreationale.SpitalFactory.Clase.Personal;
import DPCreationale.SpitalFactory.Fabrici.PersMedicalFabrica;
import DPCreationale.SpitalFactory.Fabrici.TipPersonalMedical;

public class Main {
    static void main(String[] args) {

        PersMedicalFabrica fabricaMedical = new PersMedicalFabrica();

        Personal asistent = fabricaMedical.getPersonalMdical(TipPersonalMedical.ASISTENT, "Natalia", "Pediatrie", 21, 2000," AAA", 30);
        asistent.afisarePersonal();

        ((Asistent)asistent).setSef("bbb");

        asistent.afisarePersonal();
    }
}
