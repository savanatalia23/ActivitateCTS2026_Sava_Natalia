package Proxy.Farmacie.Clase;

import Composite.Farmacie.clase.Structura;

public class Medicament implements IMedicament{

    protected String nume;
    protected boolean areReteta;

    public Medicament( String nume) {
        this.areReteta = true;
        this.nume = nume;
    }

    public boolean isAreReteta() {
        return areReteta;
    }

    public void setAreReteta(boolean areReteta) {
        this.areReteta = areReteta;
    }

    @Override
    public void afisreMedicament() {
        System.out.println("Medicamentul " + this.nume+ " a fost eliberat");
    }
}
