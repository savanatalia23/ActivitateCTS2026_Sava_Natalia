package Subiectul1.Clase;

public class Cafea implements Bautura {

    protected String nume;
    protected int volum;
    protected float pret;

    public Cafea() {
    }

    ;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea: ");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        return sb.toString();
    }

    @Override
    public void metodaPreparare() {
        System.out.println("Metoda preparare: Se pune apa la fiert, iar dupa ce fierbe sa pune cafeaua in apa");

    }

    @Override
    public Bautura copiaza() {

        Cafea copie = new Cafea();

        //deep copy
        copie.volum = this.volum;
        copie.nume = this.nume;
        copie.pret = this.pret;
        return copie;

    }

    public Cafea(String nume, float pret, int volum) {

        if (!nume.equals("")) {
            this.nume = nume;
        } else {
            this.nume = "N/A";
        }
        if (pret > 0.0f) {
            this.pret = pret;
        } else {
            pret = 0.0f;
        }
        if (volum > 0) {
            this.volum = volum;
        } else {
            this.volum = 0;
        }

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }
}
