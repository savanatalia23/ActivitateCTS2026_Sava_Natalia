package DPStructurale.Proxy.Ex1.Clase;

public class Statie implements IStatie{

    private String  adresa;

    public Statie(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void opreste(Autobuz autobuz) {
        System.out.println("Autobuzul cu numarul " + autobuz.getNr() + " a oprit in statia " + this.adresa);
    }
}
