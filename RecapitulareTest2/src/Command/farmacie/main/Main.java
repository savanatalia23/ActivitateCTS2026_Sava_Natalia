package Command.farmacie.main;

import Adapter.Farmacie.deObiecte.Farmacie;
import Command.farmacie.clase.*;

public class Main {
    static void main(String[] args) {
        Farmacist farmacist = new Farmacist("Natalia");

        IComand com1 = new PreiaReteta(farmacist);
        IComand com2 = new PreiaReteta(farmacist);

        Operator op = new Operator();
        op.adaugaCom(com1);
        op.adaugaCom(com2);
        op.executaComanda(new Reteta("Paracetamol"));
        op.executaComanda(new Reteta("Nurofen"));
        op.executaComanda(new Reteta("MAgneziu"));
    }
}
