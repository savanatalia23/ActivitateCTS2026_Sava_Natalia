package DPStructurale.Proxy.Ex1.Main;

import DPStructurale.Proxy.Ex1.Clase.Autobuz;
import DPStructurale.Proxy.Ex1.Clase.IStatie;
import DPStructurale.Proxy.Ex1.Clase.ProxyStatie;
import DPStructurale.Proxy.Ex1.Clase.Statie;

public class Main {
    static void main(String[] args) {

        Autobuz a1 = new Autobuz(10, 335);
        IStatie s1 = new Statie("Str. Ramn Valcea 30");

        s1.opreste(a1);

        ProxyStatie statieProxy = new ProxyStatie(s1);
        statieProxy.opreste(a1);
        statieProxy.opreste(a1);
        statieProxy.opreste(a1);
    }
}
