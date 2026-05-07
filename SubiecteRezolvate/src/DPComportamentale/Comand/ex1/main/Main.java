package DPComportamentale.Comand.ex1.main;

import DPComportamentale.Comand.ex1.clase.Autobuz;
import DPComportamentale.Comand.ex1.clase.Command;
import DPComportamentale.Comand.ex1.clase.Operator;
import DPComportamentale.Comand.ex1.clase.Plecare;

public class Main {
    static void main(String[] args) {
        Operator operator = new Operator();
        Command comanda1 = new Plecare(new Autobuz("Mercedes"), 21);
        Command comanda2 = new Plecare(new Autobuz("BMW"), 32);
        Command comanda3 = new Plecare(new Autobuz("Mercedes"), 50);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(comanda3);

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();


    }
}
