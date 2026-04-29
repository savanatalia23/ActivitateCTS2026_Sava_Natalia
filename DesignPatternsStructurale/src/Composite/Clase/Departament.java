package Composite.Clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{

    private  String numeDep;
    private List<Structura> subStructuri;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.subStructuri = new ArrayList<>();
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume Deoartament: "+ this.numeDep);
        for(Structura structura: subStructuri)
        {
            structura.afiseazaDetaliiStructura(spatii+ "   ");
        }
    }

    public void adaugaStructura(Structura structura){
        this.subStructuri.add(structura);
    }
    public void stergeStructura(Structura structura){
        this.subStructuri.remove(structura);
    }
    public void getStructura( int pozitie){
        this.subStructuri.get(pozitie);
    }
}
