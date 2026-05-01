package DPCreationale.Singleton.eager;

public class SingeltonEager {

    private String nume;
    private int pret;

    private static SingeltonEager intanta = new SingeltonEager();

    private SingeltonEager(){
        this.nume = "NATALIA";
        this.pret = 100;
    }

    public static SingeltonEager getInstance(){ return  intanta;}


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingeltonEager: ");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        return sb.toString();
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
