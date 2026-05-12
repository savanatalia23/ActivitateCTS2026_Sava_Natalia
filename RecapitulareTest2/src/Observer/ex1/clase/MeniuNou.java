package Observer.ex1.clase;

import Strategy.ex1.clase.Client;

import java.util.ArrayList;
import java.util.List;

public class MeniuNou implements Oferta{

    List<IClient> clienti;

    public MeniuNou() {
        this.clienti = new ArrayList<>();
    }

    @Override
    public void adaugaClient(IClient client) {
        clienti.add(client);
    }

    @Override
    public void stergereClient(IClient client) {
        clienti.remove(client);
    }

    @Override
    public void notifica(String mesaj) {
        if(clienti.size()>0)
        {
            for(IClient client : clienti)
            {
                client.notifica(mesaj);
            }
        }
        else{
            System.out.println("nu avem clienti in lista");
        }
    }
    public void meniuPaste()
    {
        notifica("Avem meniu nou pentru Paste!");
    }
    public void meniuCraciun()
    {
        notifica("Avem meniu nou pentru Craciun!");
    }
}
