package Command.ex1.clase;

import java.util.ArrayList;
import java.util.List;

public class Ospatar implements IOspatar {
    List<IComanda> comenzi;

    public Ospatar() {
        this.comenzi = new ArrayList<>();
    }

    @Override
    public void adaugaComanda(IComanda comanda) {
        comenzi.add(comanda);
    }

    @Override
    public void stergeComanda(IComanda comanda) {
        comenzi.remove(comanda);
    }

    @Override
    public void preiaComanda() {

        if(comenzi.size()>0)
        {
            comenzi.getFirst().executaComanda();
            comenzi.removeFirst();

        }
        else{
            System.out.println("Nu avem comenzi in lista");
        }
    }
}
