package Strategy.Main;

import Strategy.Clase.Cash;
import Strategy.Clase.Client;

public class Main {
    static void main(String[] args) {

        Client client1 = new Client("Natalia");

        client1.platesteTranzactie(23);
        client1.setModalitateDePlata(new Cash());
        client1.platesteTranzactie(24);
    }
}
