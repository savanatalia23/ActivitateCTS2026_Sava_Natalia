package Decorator.Clase.Decorator;

import Decorator.Clase.INotadePlata;

public class NotaDePlata1Mai extends NotadePlataDecoratorAbstarct{
    public NotaDePlata1Mai(INotadePlata notaPlata) {
        super(notaPlata);
    }


    @Override
    public void printeazaFelicitare() {
        super.printeaza();
        System.out.println("La Multi Ani de 1 Mai");

    }
}
