package Decorater.Farmacie.main;

import Decorater.Farmacie.clase.BonDeCasa;
import Decorater.Farmacie.clase.Decorator;
import Decorater.Farmacie.clase.IBonDeCasa;
import Decorater.Farmacie.clase.LaMultiAni;

public class Main {
    static void main(String[] args) {
        IBonDeCasa bon1 = new BonDeCasa("Natalia");

        Decorator bon1Decorat = new LaMultiAni(bon1);

        bon1.printeaza();
        bon1Decorat.printeaza();
    }
}
