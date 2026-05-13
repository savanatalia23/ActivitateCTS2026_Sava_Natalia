package Flweight.ex1.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruClienti {

    protected Map<String, IClient> listaClienti = new HashMap<>();

    public IClient getClient(String nume, String tel, String email) {
        IClient client = listaClienti.get(email);
        if (client == null) {
            client = new Client(email, nume, tel);
            listaClienti.put(email, client);
        }
        return client;
    }

}
