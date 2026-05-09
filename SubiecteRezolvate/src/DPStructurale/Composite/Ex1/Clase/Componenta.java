package DPStructurale.Composite.Ex1.Clase;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Componenta extends Structura{

    protected List<Structura> listaSubStructuri;

    public Componenta(String numeStructura ) {
        super(numeStructura);
        this.listaSubStructuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura){
        listaSubStructuri.add(structura);
    }
    public void stergeStructura(Structura structura)
    {
        listaSubStructuri.remove(structura);
    }
    public Structura getStructura(int pozitie){
        return listaSubStructuri.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + this.numeStructura);
        for(Structura struct : listaSubStructuri)
        {
            struct.afiseazaDetaliiStructura(spatii + "   ");
        }
    }
}
