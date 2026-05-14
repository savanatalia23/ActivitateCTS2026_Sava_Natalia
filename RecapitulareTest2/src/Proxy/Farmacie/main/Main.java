package Proxy.Farmacie.main;

import Proxy.Farmacie.Clase.Medicament;
import Proxy.Farmacie.Clase.ProxyMedicament;

public class Main {
    static void main(String[] args) {
        Medicament med1 = new Medicament("Nurofen");

        med1.afisreMedicament();
        ProxyMedicament proxy = new ProxyMedicament(med1);
        proxy.afisreMedicament();
        med1.setAreReteta(false);
        proxy.afisreMedicament();

    }
}
