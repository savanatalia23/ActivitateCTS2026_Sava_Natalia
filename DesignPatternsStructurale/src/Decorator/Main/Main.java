package Decorator.Main;

import Decorator.Clase.Decorator.NotaDePlata1Mai;
import Decorator.Clase.Decorator.NotadePlataDecoratorAbstarct;
import Decorator.Clase.Decorator.NotadePlataDecoratorAbstarct;
import Decorator.Clase.Decorator.NotadeplataNoulAn;
import Decorator.Clase.INotadePlata;
import Decorator.Clase.NotadePlata;

public class Main {
    static void main(String[] args) {

        INotadePlata nota1 = new NotadePlata("28.02.2026", 250);
        nota1.printeaza();

        int a = 0;
        NotadePlataDecoratorAbstarct notaDePlataDecorator = null;

        if(a==1){
            notaDePlataDecorator = new NotadeplataNoulAn(nota1);
        }
        else{
            notaDePlataDecorator = new NotaDePlata1Mai(nota1);
        }

        notaDePlataDecorator.printeaza();



    }
}
