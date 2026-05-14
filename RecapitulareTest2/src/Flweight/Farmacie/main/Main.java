package Flweight.Farmacie.main;

import Flweight.Farmacie.clase.IPacient;
import Flweight.Farmacie.clase.Pacient;
import Flweight.Farmacie.clase.RegistruPacienti;
import Flweight.Farmacie.clase.Reteta;

public class Main {
    static void main(String[] args) {
        RegistruPacienti registruPacienti = new RegistruPacienti();

        registruPacienti.getPacient("Natalia", 21).afisareDetalii(new Reteta(2,4,70));
    }
}
