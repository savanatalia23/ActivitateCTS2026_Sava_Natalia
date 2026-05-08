package ro.ase.seminar4.factoryMethod.fabrici;

import ro.ase.seminar4.factoryMethod.clase.Clatite;
import ro.ase.seminar4.factoryMethod.clase.FelDeMancare;
import ro.ase.seminar4.factoryMethod.clase.Papanasi;

public class DesertFabrica  implements FelDeMancareFabrica{
    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip, gramaj, denumire, 500);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        switch (tip){
            case TipDesert.Clatita:
                return new Clatite(gramaj, denumire, calorii);
            case TipDesert.Papanasi:
                return  new Papanasi(gramaj, denumire, calorii);

            default:
                throw new IllegalStateException("Unexpected value: " + tip);
        }
    }
}
