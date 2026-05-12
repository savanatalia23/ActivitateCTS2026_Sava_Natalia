package DPStructurale.Adapter.deClase.Main;

import DPStructurale.Adapter.deClase.Clase.Adapter;
import DPStructurale.Adapter.deClase.Clase.Farmacie;
import DPStructurale.Adapter.deClase.Clase.ISpital;
import DPStructurale.Adapter.deClase.Clase.Spital;

public class Main {
    static void main(String[] args) {
        ISpital spital = new Spital(21);

        Adapter adapterFarmacieLaSpital = new Adapter("Catena");
        spital.afiseazaSpital();
        adapterFarmacieLaSpital.afiseazaSpital();
    }
}
