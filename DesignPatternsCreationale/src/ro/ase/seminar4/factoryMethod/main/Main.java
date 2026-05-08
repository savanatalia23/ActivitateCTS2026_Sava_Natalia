package ro.ase.seminar4.factoryMethod.main;

import ro.ase.seminar4.factoryMethod.clase.FelDeMancare;
import ro.ase.seminar4.factoryMethod.clase.Supa;
import ro.ase.seminar4.factoryMethod.clase.SupaCrema;
import ro.ase.seminar4.factoryMethod.fabrici.*;

public class Main {
    static void main(String[] args) {

        FelDeMancareFabrica fabricaSupa =  new SupaFabrica();
        FelDeMancare supaCrema = fabricaSupa.getFelDeMancare(TipSupa.SupaCrema, 600, "Supa de Morcovi");
        FelDeMancare ciorba = fabricaSupa.getFelDeMancare(TipSupa.Ciorba, 300, " Ciorba de vacuta");

        supaCrema.afiseaza();
        ciorba.afiseaza();

        FelDeMancareFabrica fabricaDesert = new DesertFabrica();
        FelDeMancare papanasi = fabricaDesert.getFelDeMancare(TipDesert.Papanasi, 200, " Cu gem de visine",1000);
        FelDeMancare clatita = fabricaDesert.getFelDeMancare(TipDesert.Clatita, 250, " cu ciocolata", 700);

        papanasi.afiseaza();
        clatita.afiseaza();
    }
}
