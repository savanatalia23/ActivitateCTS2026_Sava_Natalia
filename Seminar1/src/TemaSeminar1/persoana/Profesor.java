package TemaSeminar1.persoana;

import TemaSeminar1.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;

    public Profesor(String name, int varsta, String idAngajat) {
        super(name, varsta);
        this.idAngajat = idAngajat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Id-ul profesorului este ");
        sb.append(idAngajat).append('\'');
        sb.append(", numele ='").append(super.nume).append('\'');
        return sb.toString();
    }

    @Override
    public void preda() {
        System.out.println("Profesorul " + nume + " este profesor de curs");

    }
}
