package DPCreationale.Singleton.thread;

public class SingletonThread {

    private String nume;
    private int pret;
    private static SingletonThread instanta = null;

    private SingletonThread(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingletonThread: ");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        return sb.toString();
    }

    public static synchronized SingletonThread getInstance(String nume, int pret)
    {
        if(instanta == null)
        {
            instanta = new SingletonThread(nume, pret);

        }
        return  instanta;
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
