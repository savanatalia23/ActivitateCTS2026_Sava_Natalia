package ChainOfResponsability.ex1.main;

import ChainOfResponsability.ex1.clase.*;

public class Main {
    static void main(String[] args) {
        Problema p1 = new Problema(2);
        Problema p2 = new Problema(5);
        Problema p3 = new Problema(10);

        Nivel n1 = new Nivel1();
        Nivel n2 = new Nivel2();
        Nivel n3 = new Nivel3();

        n1.setSucceor(n2);
        n2.setSucceor(n3);

        n1.tratareProblema(p1);
        n1.tratareProblema(p2);
        n1.tratareProblema(p3);
    }
}
