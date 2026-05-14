package Strategy.Farmacie.main;


import Strategy.Farmacie.clase.Card;
import Strategy.Farmacie.clase.Cash;
import Strategy.Farmacie.clase.Client;

public class Main {
    static void main(String[] args) {
        Client cl1 = new Client(new Card(20), "Natalia");

       cl1.print();
       cl1.setModalitate(new Cash(14));
       cl1.print();

    }
}
