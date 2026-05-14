package Adapter.Farmacie.deObiecte;

public class Depozit {

    public Depozit( ) {
    }

    public boolean verificaStocPentruMedicament(int id, int numarDorit) {
        System.out.println("Gestiune Nouă: Verific stoc pentru ID " + id + " cantitate " + numarDorit);
        return true;
    }
}
