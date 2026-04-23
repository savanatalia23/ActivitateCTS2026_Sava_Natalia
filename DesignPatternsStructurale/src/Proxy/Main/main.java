package Proxy.Main;

import Proxy.Clase.Pacient;
import Proxy.Clase.Spital;
import Proxy.SpitalProxy.ProxyCuAsigurare;

public class main {
    static void main(String[] args) {
        Pacient pacient1 = new Pacient(false,  "Natalia");

        Spital spital = new Spital("Judetean");

        spital.interneazaPacient(pacient1);

        ProxyCuAsigurare proxy = new ProxyCuAsigurare(spital);

        proxy.interneazaPacient(pacient1);
    }
}
