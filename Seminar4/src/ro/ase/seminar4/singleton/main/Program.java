package ro.ase.seminar4.singleton.main;

import ro.ase.seminar4.singleton.clase.Logger;

public class Program {

    static void main() {

        Logger instanta = Logger.getInstance("Interfata", "afisare");

        instanta.afisareLog("Fisierul json nu este afisat corect");
        instanta.afisareLog("Eroare");

        Logger instanta2 = Logger.getInstance("Backend", "afisare");
        instanta2.afisareLog("Eroare2");

        instanta2.setSender("Backend");
        instanta2.setCategorie("afisare2");

        instanta2.afisareLog("Eroare la inserare");

        //atentie constructorul sa fie PRIVAT!!
    }
}
