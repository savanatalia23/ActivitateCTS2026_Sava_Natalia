package DPStructurale.FlyWeight.ex1.main;

import DPStructurale.FlyWeight.ex1.Clase.Autobuz;
import DPStructurale.FlyWeight.ex1.Clase.ILinie;
import DPStructurale.FlyWeight.ex1.Clase.Linie;
import DPStructurale.FlyWeight.ex1.Clase.RegistruLinie;

public class Main {
    static void main(String[] args) {

        RegistruLinie registruLinie = new RegistruLinie();

        registruLinie.cautaLinie(100, "Piata unirii", "Aeroport OTP").defasurator(new Autobuz(2010, "Mercedes", 40));
    }
}
