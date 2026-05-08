package DPComportamentale.Comand.ex2.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    List<Command> listaComenzi;

    public Operator(){
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaComanada(Command comanda)
    {
        listaComenzi.add(comanda);
    }
    public void realizeazaComanda()
    {
        if (listaComenzi.size()>0)
        {
            listaComenzi.getFirst().realiazeazaComanda();
            listaComenzi.removeFirst();
        }
        else{
            System.out.println("Nu mai exista comenzi de efectuat!");

        }
    }
}
