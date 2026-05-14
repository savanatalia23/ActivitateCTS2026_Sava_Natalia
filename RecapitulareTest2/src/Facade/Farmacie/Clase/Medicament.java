package Facade.Farmacie.Clase;

public class Medicament {
    protected String nume;
    protected boolean esteDisp;

    public Medicament( String nume) {
        this.esteDisp = true;
        this.nume = nume;
    }

    public boolean esteDisp()
    {
        return this.esteDisp;
    }

    public void setEsteDisp(boolean esteDisp) {
        this.esteDisp = esteDisp;
    }
}
