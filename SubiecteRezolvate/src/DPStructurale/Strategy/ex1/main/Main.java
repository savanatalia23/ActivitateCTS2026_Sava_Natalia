package DPStructurale.Strategy.ex1.main;

import DPStructurale.Strategy.ex1.clase.Calator;
import DPStructurale.Strategy.ex1.clase.CardBancar;
import DPStructurale.Strategy.ex1.clase.SMS;

public class Main {
    static void main(String[] args) {
        Calator Natalia = new Calator("Natalia");

        Natalia.efectuarePlata();
        Natalia.setModalitateDePlata(new CardBancar());
        Natalia.efectuarePlata();
        Natalia.setModalitateDePlata(new SMS("6751", 2.5));
        Natalia.efectuarePlata();
    }
}
