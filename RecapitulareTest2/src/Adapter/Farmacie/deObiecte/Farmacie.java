package Adapter.Farmacie.deObiecte;

public class Farmacie implements IFarmacie {

    private int idMedicamentSetat;

    public void setareMedicament(int id) {
        this.idMedicamentSetat = id;
        System.out.println("S-a setat medicamentul cu ID: " + id);
    }

    public boolean verificareDisponibilitate(int cantitate) {
        return true;
    }
}
