package DPComportamentale.Comand.ex2.main;

import DPComportamentale.Comand.ex2.clase.*;

public class Main {
    static void main(String[] args) {
        Operator operator = new Operator();

        Command comanda1 = new Ocupare(new Masa(10, 5), "Natalia");
        Command comanda2 = new Ocupare(new Masa(8, 9), "Andreea");
        Command comanda3= new Rezervare(new Masa(5, 1), "Philipe");

        operator.adaugaComanada(comanda1);
        operator.adaugaComanada(comanda2);
        operator.adaugaComanada(comanda3);

        operator.realizeazaComanda();
        operator.realizeazaComanda();
        operator.realizeazaComanda();
        operator.realizeazaComanda();
    }
}
