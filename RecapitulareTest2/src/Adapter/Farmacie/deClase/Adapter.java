package Adapter.Farmacie.deClase;

public class Adapter extends Farmacie {

    private Depozit softwareNou;

    private int idMedicamentCurent;

    public Adapter(Depozit softwareNou) {
        this.softwareNou = softwareNou;
    }

    public void setareMedicament(int id) {

        this.idMedicamentCurent = id;
    }

    public boolean verificareDisponibilitate(int cantitate) {
        return softwareNou.verificaStocPentruMedicament(idMedicamentCurent, cantitate);
    }
}
