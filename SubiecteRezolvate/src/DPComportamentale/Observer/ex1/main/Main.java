package DPComportamentale.Observer.ex1.main;

import DPComportamentale.Observer.ex1.clase.ClientAbonat;
import DPComportamentale.Observer.ex1.clase.IClient;
import DPComportamentale.Observer.ex1.clase.IRestaurant;
import DPComportamentale.Observer.ex1.clase.Restaurant;

public class Main {
    static void main(String[] args) {
        IClient client1 = new ClientAbonat("Natalia");
        IClient client2 = new ClientAbonat("Andreea");
        IClient client3 = new ClientAbonat("Philipe");

        IRestaurant restaurant = new Restaurant();

        restaurant.adaugaClient(client1);
        restaurant.adaugaClient(client2);
        restaurant.adaugaClient(client3);
        ((Restaurant)restaurant).notificareMeniuNou();
        restaurant.dezaboneazaClient(client1);
        ((Restaurant)restaurant).notificareProdusNou();


    }
}
