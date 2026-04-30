package FlyWeight.Clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;

    public Rezervare(int nrMasa, int nrPersoane, String oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare: ");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        return sb.toString();
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }
}
