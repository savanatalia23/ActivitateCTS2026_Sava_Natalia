package DPComportamentale.Comand.ex1.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<Command> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda()
    {

        if( listaComenzi.size()>0)
        {
            listaComenzi.get(0).pleacaInCursa();
            listaComenzi.remove(0);
        }
        else System.out.println("Nu mai sunt comenzi de exewcutat!");

    }
}
