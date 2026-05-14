package Observer.Farmacie.clase;

import java.util.ArrayList;
import java.util.List;

public class Notificare implements INotificare{

    protected List<IClient> listaClienti;

    public Notificare() {
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void adaugaClient(IClient client) {
        listaClienti.add(client);
    }

    @Override
    public void scoateClient(IClient client) {
        listaClienti.remove(client);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (IClient client : listaClienti)
            client.notifica(mesaj);

    }
}
