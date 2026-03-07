package ro.ase.seminar2.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static float sumaFinantata = 10;

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
        super();

    }

    @Override
    public String toString() {
        StringBuilder sbAngajat = new StringBuilder();
        sbAngajat.append("Angajatul { ");
        sbAngajat.append(super.toString());
        sbAngajat.append("Ocupatie="  + this.ocupatie + ", salariu=" + this.salariu);
        return sbAngajat.toString();
    }


    public void afisareVenit() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + Angajat.sumaFinantata + " Euro/zi in proiect.");
    }


    public static void setSumaFinantata(float sumaFinantata) {
        Angajat.sumaFinantata = sumaFinantata;
    }
}
