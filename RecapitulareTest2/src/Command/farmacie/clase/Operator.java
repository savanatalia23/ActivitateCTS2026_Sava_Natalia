package Command.farmacie.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    protected List<IComand> listaComenzi = new ArrayList<>();

    public void adaugaCom(IComand comand)
    {
        listaComenzi.add(comand);
    }
    public void stergeCom(IComand comand){
        listaComenzi.remove(comand);
    }

    public void executaComanda(Reteta reteta){
        if(listaComenzi.size()>0)
        {
            listaComenzi.getFirst().executa(reteta);
            listaComenzi.removeFirst();
        }
        else{
            System.out.println("Nu mai sunt comenzi!");
        }
    }
}
