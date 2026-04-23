package Proxy.Clase;

public class Pacient {
    private String nume;
    private boolean areAsigurare;

    public Pacient(boolean areAsigurare, String nume) {
        this.areAsigurare = areAsigurare;
        this.nume = nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public String getNume() {
        return nume;
    }
}
