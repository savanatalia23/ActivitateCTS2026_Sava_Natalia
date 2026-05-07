package DPComportamentale.Observer.ex1.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{

    List<IClient> listaClienti;

    public Restaurant() {
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void adaugaClient(IClient clientNou) {
        listaClienti.add(clientNou);
    }

    @Override
    public void dezaboneazaClient(IClient clientNou) {
        listaClienti.remove(clientNou);
    }

    @Override
    public void trimiteNotificari(String mesaj) {
        for(IClient clinet : listaClienti)
        {
            clinet.notificare(mesaj);
        }
    }

    public void notificareProdusNou()
    {
        trimiteNotificari("A aparut un produs nou in restaurant!");
    }

    public void notificareMeniuNou()
    {
        trimiteNotificari("A aparut un meniu nou in restaurant!");
    }
}
