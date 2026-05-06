package Command.clase;

import Command.clase.comenzi.Command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi = new ArrayList<>();

    public void inregistreaza(Command comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda()
    {

        if(listaComenzi.size()>0)
        {
            listaComenzi.get(0).executa();
            listaComenzi.remove(0);
        }
        else{
            System.out.printf("Nu exita comenzi  " + "\n");
        }
    }
}
