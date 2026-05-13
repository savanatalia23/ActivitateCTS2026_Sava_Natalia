package Decorater.ex1.main;

import Decorater.ex1.clase.*;

public class Main {
    static void main(String[] args) {
        IExtrasCont extras1 = new ExtrasContLei(20,"Natalia");
        IExtrasCont extras2 = new ExtrasContLei(10,"Andreea");

        IExtrasCont extras3 = new ExtrasContEuro(3,"Bianca");
        IExtrasCont extras4 = new ExtrasContEuro(4,"Maria");

        extras2.genereazaExtras();

        Decorator decMultumim = new Multumim(extras1);
        decMultumim.adaugaMesaj();

        Decorator decMultumim2 = new Multumim(extras2);
        decMultumim2.adaugaMesaj();

        Decorator decMultumim3 = new Multumim(extras3);
        decMultumim3.adaugaMesaj();

        Decorator decMultumim4 = new Multumim(extras4);
        decMultumim4.adaugaMesaj();


    }
}
