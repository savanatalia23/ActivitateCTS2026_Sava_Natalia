package TemaSeminar1.persoana;

import TemaSeminar1.interfete.IPersona;

public class Persoana implements IPersona {
    protected String nume;
    protected int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Persoana() {

    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
}
