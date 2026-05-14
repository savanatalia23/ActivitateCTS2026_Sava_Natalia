package Facade.Farmacie.Clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    protected String nume;
    protected boolean esteValabila;
    protected List<Medicament> listaMedicamente;

    public Reteta( String nume) {
        this.esteValabila = true;
        this.nume = nume;
        this.listaMedicamente = new ArrayList<>();
    }

    public void setEsteValabila(boolean esteValabila) {
        this.esteValabila = esteValabila;
    }

    public boolean isEsteValabila() {
        return esteValabila;
    }
    public void adaugaMedicament(Medicament med)
    {
        listaMedicamente.add(med);
    }
    public void stergeMedicament(Medicament med)
    {
        listaMedicamente.remove(med);
    }
}
