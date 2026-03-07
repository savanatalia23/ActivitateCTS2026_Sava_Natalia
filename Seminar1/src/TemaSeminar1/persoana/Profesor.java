package TemaSeminar1.persoana;

public class Profesor extends Persoana{
    private String idAngajat;
    private String name;

    public Profesor(String idAngajat, String name) {
        this.idAngajat = idAngajat;
        this.name = name;
    }

    public String getIdAngajat() {
        return idAngajat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Profesor{");
        sb.append("idAngajat='").append(idAngajat).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
