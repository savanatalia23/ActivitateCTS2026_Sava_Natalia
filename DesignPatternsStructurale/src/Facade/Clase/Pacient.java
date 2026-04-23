package Facade.Clase;

public class Pacient {

    private String nume;
    private int gravitate;

    public Pacient(int gravitate, String nume) {
        this.gravitate = gravitate;
        this.nume = nume;
    }

    public int getGravitate() {
        return gravitate;
    }

    public void setGravitate(int gravitate) {
        this.gravitate = gravitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient: ");
        sb.append("gravitate=").append(gravitate);
        sb.append(", nume='").append(nume).append('\'');
        return sb.toString();
    }
}
