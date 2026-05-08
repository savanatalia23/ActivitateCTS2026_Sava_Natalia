package DPComportamentale.Comand.ex3.clase;

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

    public void exeecutaComanda()
    {
        if(listaComenzi.size()>0){
            listaComenzi.getFirst().spitalizare();
            listaComenzi.removeFirst();
        }
        else{
            System.out.println("Nu mai exista comenzi inregistrate");
        }
    }
}
