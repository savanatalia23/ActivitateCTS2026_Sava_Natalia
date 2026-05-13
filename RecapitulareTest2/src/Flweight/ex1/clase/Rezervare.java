package Flweight.ex1.clase;

public class Rezervare {

    protected String nrMasa;
    protected String nrPersone;
    protected String ora;

    public Rezervare(String nrMasa, String nrPersone, String ora) {
        this.nrMasa = nrMasa;
        this.nrPersone = nrPersone;
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare: ");
        sb.append("nrMasa='").append(nrMasa).append('\'');
        sb.append(", nrPersone='").append(nrPersone).append('\'');
        sb.append(", ora='").append(ora).append('\'');
        return sb.toString();
    }
}
