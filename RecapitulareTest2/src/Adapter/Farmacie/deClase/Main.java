package Adapter.Farmacie.deClase;

public class Main {
    public static void main(String[] args) {

        Depozit gestiuneNoua = new Depozit();

        Adapter farmacie = new Adapter(gestiuneNoua);

        farmacie.setareMedicament(101);

        boolean disponibil = farmacie.verificareDisponibilitate(5);

        if (disponibil) {
            System.out.println("Tranzacție reușită prin noul sistem de gestiune!");
        }
    }
}
