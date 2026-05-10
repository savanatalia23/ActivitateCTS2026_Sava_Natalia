package DPStructurale.Decorater.Main;

import DPStructurale.Decorater.Clase.AbstractFelicitare;
import DPStructurale.Decorater.Clase.Bilet;
import DPStructurale.Decorater.Clase.FelicitareAnNou;
import DPStructurale.Decorater.Clase.IBilet;

public class Main {
    static void main(String[] args) {
        IBilet bilet1 = new Bilet(1, "Natalia");

        System.out.println(bilet1.printeza());

        AbstractFelicitare felicitare1 = new FelicitareAnNou(bilet1);
        felicitare1.adaugaMesaj();

    }
}
