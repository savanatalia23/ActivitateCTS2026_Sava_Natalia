package Command.ex1.main;

import Command.ex1.clase.*;

public class Main {

    static void main(String[] args) {
        Bucatar b1 = new Bucatar("Natalia");
        Bucatar b2 = new Bucatar("Andreea");

        IComanda c1 = new ComandaBurger("Cheeseburger", 50, b1);
        IComanda c2 = new ComandaPizza("Margerita", 30, b2);

        IOspatar ospatar = new Ospatar();

        ospatar.adaugaComanda(c1);
        ospatar.adaugaComanda(c2);

        ospatar.preiaComanda();
        ospatar.preiaComanda();
        ospatar.preiaComanda();
    }
}
