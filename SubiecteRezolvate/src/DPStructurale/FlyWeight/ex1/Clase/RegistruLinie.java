package DPStructurale.FlyWeight.ex1.Clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruLinie {

    public Map<Integer, ILinie> registruLinii = new HashMap<>();

    public ILinie cautaLinie(int nrLinie, String primaStatie, String ultimaStatie)
    {
        ILinie linie = registruLinii.get(nrLinie);
        if(linie == null)
        {
            linie = new Linie(nrLinie,primaStatie,ultimaStatie);
            registruLinii.put(nrLinie, linie);
        }
        return linie;
    }
}
