package Decorator.Clase.Decorator;

import Decorator.Clase.INotadePlata;
import Decorator.Clase.NotadePlata;

public abstract class NotadePlataDecoratorAbstarct implements INotadePlata {

    INotadePlata notaPlata;

    public NotadePlataDecoratorAbstarct(INotadePlata notaPlata) {
        this.notaPlata = notaPlata;
    }

    @Override
    public void printeaza() {
        notaPlata.printeaza();
    }
    public abstract void printeazaFelicitare();

}
