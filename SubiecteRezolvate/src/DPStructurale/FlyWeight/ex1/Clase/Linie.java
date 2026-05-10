package DPStructurale.FlyWeight.ex1.Clase;

public class Linie implements ILinie{
    protected int nrLinie;
    protected String primaStatie;
    protected String ultimasStatie;

    public Linie(int nrLinie, String primaStatie, String ultimasStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimasStatie = ultimasStatie;
    }

    @Override
    public void defasurator(Autobuz autobuz) {
        System.out.println("Pe linia " + this.nrLinie + " prima statie este "+ this.primaStatie+ " iar ulima statie este " + this.ultimasStatie+ " si circula "+ autobuz.toString());
    }
}
