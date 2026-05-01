package DPCreationale.Prototype.Ex1.v2.clase;

public class Autobuz2 implements MijlocDeTransport2{

    private String firmaTransport;
    private String brandAutobuz;
    protected String denumireLinie;
    protected int capacitatePersoane;

    public Autobuz2() {
        this.denumireLinie = "N/A";
        this.capacitatePersoane = 2;
        this.firmaTransport = "STB";
        this.brandAutobuz = "MAN";
    }

    public Autobuz2(String denumireLinie, int capacitatePersoane, String firmaTransport, String brandAutobuz) {
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
        if( ! firmaTransport.equalsIgnoreCase(""))
        {
            this.firmaTransport = firmaTransport;
        }
        else {
            this.firmaTransport = "STB";
        }
        if( ! brandAutobuz.equalsIgnoreCase(""))
        {
            this.brandAutobuz = brandAutobuz;
        }
        else {
            this.brandAutobuz = "MAN";
        }
    }

    public String getFirmaTransport() {
        return firmaTransport;
    }

    public void setFirmaTransport(String firmaTransport) {
        if( ! firmaTransport.equalsIgnoreCase(""))
        {
            this.firmaTransport = firmaTransport;
        }
    }

    public String getBrandAutobuz() {
        return brandAutobuz;
    }

    public void setBrandAutobuz(String brandAutobuz) {
        if( ! brandAutobuz.equalsIgnoreCase(""))
        {
            this.brandAutobuz = brandAutobuz;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz2: ");
        sb.append("brandAutobuz='").append(brandAutobuz).append('\'');
        sb.append(", firmaTransport='").append(firmaTransport).append('\'');
        sb.append(", denumireLinie='").append(denumireLinie).append('\'');
        sb.append(", capacitatePersoane=").append(capacitatePersoane);
        return sb.toString();
    }

    @Override
    public MijlocDeTransport2 copiaza() {

        Autobuz2 autobuz = new Autobuz2();
        autobuz.capacitatePersoane = this.capacitatePersoane;
        autobuz.denumireLinie = this.denumireLinie;
        autobuz.brandAutobuz = this.brandAutobuz;
        autobuz.firmaTransport = this.firmaTransport;

        //Shallow copy: Autobuz autobuz = this;
        return  autobuz;

    }
}
