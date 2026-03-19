package ro.ase.seminar4.factoryMethod.clase;

public class Papanasi extends  Desert{
    public Papanasi(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println("Papanasi"+ super.denumire + " au "+ super.gramaj + " grame si " +  super.calorii + " calorii");
    }
}
