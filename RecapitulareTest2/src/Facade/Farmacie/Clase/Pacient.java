package Facade.Farmacie.Clase;

public class Pacient {
    protected Reteta retetea;
    protected String nume;
    protected boolean cardSanatate ;

    public Pacient(String nume, Reteta retetea) {
        this.nume = nume;
        this.retetea = retetea;
        this.cardSanatate = true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacientul cu numele: ");
        sb.append(nume);
        sb.append(" are reteta: ").append(retetea);
        return sb.toString();
    }

    public void setCardSanatate(boolean cardSanatate) {
        this.cardSanatate = cardSanatate;
    }
}
