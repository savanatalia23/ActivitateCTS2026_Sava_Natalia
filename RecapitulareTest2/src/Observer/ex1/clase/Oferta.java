package Observer.ex1.clase;

import Strategy.ex1.clase.Client;

public interface Oferta {
    void adaugaClient(IClient client);
    void stergereClient(IClient client);
    void notifica(String mesaj);
}
