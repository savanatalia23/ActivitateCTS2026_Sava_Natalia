package Decorator.Clase.Decorator;

import Decorator.Clase.INotadePlata;

public class NotadeplataNoulAn extends NotadePlataDecoratorAbstarct {

    @Override
    public void printeazaFelicitare() {
        super.printeaza();
        System.out.println("Felicitari!");
    }

    public NotadeplataNoulAn(INotadePlata notaPlata) {
        super(notaPlata);
    }
}




