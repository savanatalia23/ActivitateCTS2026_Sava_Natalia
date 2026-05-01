package DPCreationale.Prototype.Ex1.v1.clase;

public class Autobuz extends MijlocDeTransport //implements ITransport
 {

    private String firmaTransport;
    private String brandAutobuz;


    public Autobuz() {
        super();
        this.firmaTransport = "STB";
        this.brandAutobuz = "MAN";
    }

     @Override
     public MijlocDeTransport copiaza() {
         Autobuz autobuz = new Autobuz();
        autobuz.capacitatePersoane = this.capacitatePersoane;
        autobuz.denumireLinie = this.denumireLinie;
        autobuz.brandAutobuz = this.brandAutobuz;
        autobuz.firmaTransport = this.firmaTransport;

        //Shallow copy: Autobuz autobuz = this;
        return  autobuz;
        }

     public Autobuz(String denumireLinie, int capacitatePersoane, String firmaTransport, String brandAutobuz) {
        super(denumireLinie, capacitatePersoane);
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
        }    }



//    @Override
//    public ITransport copiaza() {
//        Autobuz autobuz = new Autobuz();
//        autobuz.capacitatePersoane = this.capacitatePersoane;
//        autobuz.denumireLinie = this.denumireLinie;
//        autobuz.brandAutobuz = this.brandAutobuz;
//        autobuz.firmaTransport = this.firmaTransport;
//
//        //Shallow copy: Autobuz autobuz = this;
//        return  autobuz;
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", firma =").append(firmaTransport);
        sb.append(", brand ='").append(brandAutobuz).append('\'');
        return sb.toString();
    }
}
