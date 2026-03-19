package ro.ase.seminar4.factoryMethod.fabrici;

import ro.ase.seminar4.factoryMethod.clase.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire);
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii);

}
