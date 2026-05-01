package DPCreationale.Singleton.lazy;

public class SingletonLazy {
    private String nume;
    private int pret;

    private static  SingletonLazy instanta = null;

    private SingletonLazy(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

   public static  SingletonLazy getInstanta(String nume, int pret) {
        if(instanta == null)
        {
            instanta = new SingletonLazy(nume, pret);
        }
        return  instanta;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingletonLazy: ");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        return sb.toString();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
