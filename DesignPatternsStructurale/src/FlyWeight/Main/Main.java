package FlyWeight.Main;

import FlyWeight.Clase.Client;
import FlyWeight.Clase.ClientAbstract;
import FlyWeight.Clase.RegistruClienti;
import FlyWeight.Clase.Rezervare;

public class Main {
    static void main(String[] args) {

        RegistruClienti registrtuClienti = new RegistruClienti();
        ClientAbstract client = registrtuClienti.getClient("Natalia", "0846586", "natalia@ro.ase.ro");
        ClientAbstract client2 = registrtuClienti.getClient("Andreea", "6748365", "andreea@ro.ase.ro");

        Rezervare rez1 = new Rezervare(2,2,"19:00");
        Rezervare rez2 = new Rezervare(5,3,"20:00");

        client.printeazaRezervare(rez1);
        client2.printeazaRezervare(rez2);

        client.plateste(rez1, 20.2);
        client2.plateste(rez2, 15.50);

        registrtuClienti.getClient("Andrei", "0846586", "andrei@ase.ro").printeazaRezervare(rez1);
        registrtuClienti.getClient("Andrei", "0846586", "andrei@ase.ro").plateste(rez1, 23.09);

        Rezervare rez3 = new Rezervare(4, 5, "21:00");
        registrtuClienti.getClient("Andrei","0846586", " andrei@ase.ro" ).printeazaRezervare(rez3);

    }
}
