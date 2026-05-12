package DPStructurale.Adapter.deObiecte.Main;

import DPStructurale.Adapter.deObiecte.Clase.Adapter;
import DPStructurale.Adapter.deObiecte.Clase.Spital;

public class Main {
    static void main(String[] args) {
        Spital spital = new Spital(21);

        Adapter adapterFarmacieLaSpital = new Adapter("Catena", spital);
        spital.afiseazaSpital();
        adapterFarmacieLaSpital.afiseazaSpital();
    }
}
