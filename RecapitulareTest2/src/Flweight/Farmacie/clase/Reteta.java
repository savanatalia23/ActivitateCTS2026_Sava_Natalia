package Flweight.Farmacie.clase;

public class Reteta {

    protected int nrReteta;
    protected int suma;
    protected int nrMedicamente;

    public Reteta(int nrMedicamente, int nrReteta, int suma) {
        this.nrMedicamente = nrMedicamente;
        this.nrReteta = nrReteta;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta: ");
        sb.append("are ").append(nrMedicamente);
        sb.append(" medicamente si are numarul ").append(nrReteta);
        sb.append(", iar suma totala este ").append(suma);
        return sb.toString();
    }
}
