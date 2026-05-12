package Observer.ex1.main;

import Observer.ex1.clase.ClientAbonat;
import Observer.ex1.clase.IClient;
import Observer.ex1.clase.MeniuNou;
import Observer.ex1.clase.Oferta;

public class Main {
    static void main(String[] args) {
        IClient cl1 = new ClientAbonat("Natalia", 200);
        IClient cl2 = new ClientAbonat("Maria", 180);
        IClient cl3 = new ClientAbonat("Ioana", 390);

        Oferta oferta = new MeniuNou();

        ((MeniuNou)oferta).meniuCraciun();

        oferta.adaugaClient(cl1);
        oferta.adaugaClient(cl2);
        oferta.adaugaClient(cl3);

        ((MeniuNou)oferta).meniuCraciun();
        ((MeniuNou)oferta).meniuPaste();
    }
}
