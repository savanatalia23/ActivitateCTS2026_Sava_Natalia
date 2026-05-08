package ro.ase.seminar4.factoryMethod.clase;

public class SupaCrema extends Supa {


    public SupaCrema(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Suma Crema "+ super.denumire + " are "+ super.gramaj + " grame");
    }
}
