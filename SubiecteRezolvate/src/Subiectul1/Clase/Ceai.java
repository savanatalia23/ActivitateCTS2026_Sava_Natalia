package Subiectul1.Clase;

public class Ceai implements Bautura{
    protected String nume;
    public int volum;
    protected float pret;

    @Override
    public void metodaPreparare() {
        System.out.println("Metoda preparare: Se pune apa la fiert, iar dupa ce fierbe sa toarna peste plicul de ceai");
    }

    @Override
    public Bautura copiaza() {
        Ceai copie = new Ceai();

        //deep copy
        copie.volum = this.volum;
        copie.nume = this.nume;
        copie.pret = this.pret;

        // copie =this;

        return copie;
    }
    public  Ceai(){};

    public Ceai(String nume, float pret, int volum) {
        if( ! nume.equals(""))
        {
            this.nume = nume;
        }
        else{
            this.nume = "N/A";
        }
        if( pret > 0.0f)
        {
            this.pret = pret;
        }
        else {
            pret = 0.0f;
        }
        if(volum > 0)
        {
            this.volum = volum;
        }
        else{
            this.volum = 0;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ceai:");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        return sb.toString();
    }
}
