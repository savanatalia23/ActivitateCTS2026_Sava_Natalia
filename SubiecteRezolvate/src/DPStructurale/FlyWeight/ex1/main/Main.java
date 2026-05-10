package DPStructurale.FlyWeight.ex1.main;

import DPStructurale.FlyWeight.ex1.Clase.Autobuz;
import DPStructurale.FlyWeight.ex1.Clase.ILinie;
import DPStructurale.FlyWeight.ex1.Clase.Linie;
import DPStructurale.FlyWeight.ex1.Clase.RegistruLinie;

public class Main {
    static void main(String[] args) {

        RegistruLinie registruLinie = new RegistruLinie();

        ILinie linia1 = new Linie(100, "Piata unirii", "Aeroport OTP");
        ILinie linia2 = new Linie(102, "pantelion", "Titan");
        ILinie linia3 = new Linie(123, "Gara de Nord", "CET Vitan");

        linia1.defasurator(new Autobuz(2008, "BMW", 29));
        linia2.defasurator(new Autobuz(2010, "Mercedes", 40));
        linia3.defasurator(new Autobuz(2015, "Logan", 30));

        registruLinie.cautaLinie(100, "Piata unirii", "Aeroport OTP").defasurator(new Autobuz(2010, "Mercedes", 40));
    }
}
