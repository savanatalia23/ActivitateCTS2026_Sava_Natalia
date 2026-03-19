package ro.ase.seminar4.factoryMethod.clase;

public class Clatite extends Desert{

    public Clatite(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println("Clatita "+ super.denumire + " are "+ super.gramaj + " grame si " +  super.calorii + " calorii");
    }
}
