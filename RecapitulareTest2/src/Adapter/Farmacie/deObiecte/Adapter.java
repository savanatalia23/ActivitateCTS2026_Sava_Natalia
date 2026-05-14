package Adapter.Farmacie.deObiecte;

public class Adapter extends Depozit implements IFarmacie {

    private int idMedicamentCurent;

    public Adapter( ) {
        super();
    }

    public void setareMedicament(int id) {
        this.idMedicamentCurent = id;
    }

    public boolean verificareDisponibilitate(int cantitate) {
        return super.verificaStocPentruMedicament(idMedicamentCurent, cantitate);
    }
}
