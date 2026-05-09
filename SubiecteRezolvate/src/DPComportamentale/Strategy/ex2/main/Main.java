package DPComportamentale.Strategy.ex2.main;

import DPComportamentale.Strategy.ex2.clase.Calator;
import DPComportamentale.Strategy.ex2.clase.CardBancar;
import DPComportamentale.Strategy.ex2.clase.SMS;

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
