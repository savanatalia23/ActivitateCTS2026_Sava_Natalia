package Observer.Farmacie.main;

import Observer.Farmacie.clase.Client;
import Observer.Farmacie.clase.IClient;
import Observer.Farmacie.clase.INotificare;
import Observer.Farmacie.clase.Notificare;

public class Main {
    static void main(String[] args) {
        IClient cl1 = new Client("Natalia");
        IClient cl2 = new Client("Andreea");
        IClient cl3 = new Client("Maria");

        INotificare notificare = new Notificare();
        notificare.adaugaClient(cl1);
        notificare.adaugaClient(cl2);
        notificare.adaugaClient(cl3);

        notificare.trimiteNotificare("Avem oferta noua!");
    }
}
