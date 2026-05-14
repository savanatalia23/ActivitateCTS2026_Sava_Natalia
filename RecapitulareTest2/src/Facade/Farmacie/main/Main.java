package Facade.Farmacie.main;

import Facade.Farmacie.Clase.Facade;
import Facade.Farmacie.Clase.Medicament;
import Facade.Farmacie.Clase.Pacient;
import Facade.Farmacie.Clase.Reteta;

public class Main {
    static void main(String[] args) {
        Medicament m1 = new Medicament("Paracetamol");
        Medicament m2 = new Medicament("Nurofen");
        Medicament m3 = new Medicament("Carmol");

        Reteta r1 = new Reteta("Raceala");
        r1.adaugaMedicament(m1);
        r1.adaugaMedicament(m2);
        r1.adaugaMedicament(m3);

        Pacient p1 = new Pacient("Natalia", r1);

         Facade f1 = new Facade();
         f1.eliberareReteta(p1);

         m1.setEsteDisp(false);
        f1.eliberareReteta(p1);
        r1.setEsteValabila(false);
        f1.eliberareReteta(p1);
        p1.setCardSanatate(false);
        f1.eliberareReteta(p1);
    }
}
