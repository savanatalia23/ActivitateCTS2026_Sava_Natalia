package Adapter.Farmacie.deClase;

public class Farmacie {

    private int idMedicamentSetat;

    public void setareMedicament(int id) {
        this.idMedicamentSetat = id;
        System.out.println("S-a setat medicamentul cu ID: " + id);
    }

    public boolean verificareDisponibilitate(int cantitate) {
        return true;
    }
}
