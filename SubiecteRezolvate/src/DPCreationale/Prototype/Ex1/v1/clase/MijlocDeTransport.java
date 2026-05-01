package DPCreationale.Prototype.Ex1.v1.clase;


public abstract class MijlocDeTransport   {

    protected String denumireLinie;
    protected int capacitatePersoane;

    public MijlocDeTransport() {
        this.denumireLinie = "N/A";
        this.capacitatePersoane = 2;
    }

    public MijlocDeTransport(String denumireLinie, int capacitatePersoane) {
        if(!denumireLinie.equalsIgnoreCase(""))
        {
            this.denumireLinie = denumireLinie;
        }
        else {
            this.denumireLinie = "N/A";
        }
        if(capacitatePersoane > 2)
        {
            this.capacitatePersoane =capacitatePersoane;
        }
        else {
            this.capacitatePersoane = 2;
        }
    }

    public String getDenumireLinie() {
        return denumireLinie;
    }

    public void setDenumireLinie(String denumireLinie) {
        if(!denumireLinie.equalsIgnoreCase("")){
            this.denumireLinie = denumireLinie;
        }
    }

    public int getCapacitatePersoane() {
        return capacitatePersoane;
    }

    public void setCapacitatePersoane(int capacitatePersoane) {
        if(capacitatePersoane >2 ){
            this.capacitatePersoane = capacitatePersoane;

        }
    }

    public abstract MijlocDeTransport copiaza();
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocDeTransport: ");
        sb.append("capacitatePersoane=").append(capacitatePersoane);
        sb.append(", denumireLinie='").append(denumireLinie).append('\'');
        return sb.toString();
    }
}
