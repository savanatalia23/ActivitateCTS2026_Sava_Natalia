package DPStructurale.Proxy.Ex1.Clase;

public class ProxyStatie implements IStatie{

    private IStatie statie;

    public ProxyStatie(IStatie statie) {
        this.statie = statie;
    }

    @Override
    public void opreste(Autobuz autobuz) {
            if(autobuz.areCalatori())
            {
                statie.opreste(autobuz);
            }
            else{
                System.out.println("Nu mai sunt calatori in autobuzul " + autobuz.getNr());
            }
    }
}
