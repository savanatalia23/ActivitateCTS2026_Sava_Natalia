package ro.ase.seminar4.simpleFactory.main;

import ro.ase.seminar4.simpleFactory.clase.fabrica.FactoryTransport;
import ro.ase.seminar4.simpleFactory.clase.fabrica.TipTransport;
import ro.ase.seminar4.simpleFactory.clase.mijloaceTransport.Autobuz;
import ro.ase.seminar4.simpleFactory.clase.mijloaceTransport.MijloaceTransport;

public class Program {

    static void main(String[] args) {

        FactoryTransport fabrica = new FactoryTransport();
        MijloaceTransport autobuz = fabrica.getMijlocTransport(TipTransport.Autobuz, "MAN", 12);
        autobuz.afisareTipTransport();

        MijloaceTransport tramvai = fabrica.getMijlocTransport(TipTransport.Tramvai, "Mercedes", 5);
        tramvai.afisareTipTransport();

        MijloaceTransport troleibuz = fabrica.getMijlocTransport(TipTransport.Troleibuz, "Audi", 21);
        troleibuz.afisareTipTransport();

    }
}
