package ro.ase.seminar4.factoryMethod.fabrici;

import ro.ase.seminar4.factoryMethod.clase.Ciorba;
import ro.ase.seminar4.factoryMethod.clase.Clatite;
import ro.ase.seminar4.factoryMethod.clase.FelDeMancare;
import ro.ase.seminar4.factoryMethod.clase.SupaCrema;

public class SupaFabrica implements FelDeMancareFabrica {

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip,gramaj,denumire, 500);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        switch (tip){
            case TipSupa.SupaCrema :
                return new SupaCrema(gramaj, denumire);
            case TipSupa.Ciorba:
                return new Ciorba(gramaj,denumire);
            default:
                throw new IllegalStateException("Unexpected value: " + tip);
        }
    }
}
