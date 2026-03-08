package TemaSeminar1.persoana;

import TemaSeminar1.interfete.IPredabil;

public class Asistent extends  Persoana implements IPredabil {
    private String idAsistent;

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }

    @Override
    public void preda() {
        System.out.println("Asistentul " + nume + " este profesor de seminar");
    }
}
