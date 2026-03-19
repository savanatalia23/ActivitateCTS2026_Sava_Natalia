package ro.ase.seminar4.simpleFactory.clase.fabrica;

import ro.ase.seminar4.simpleFactory.clase.mijloaceTransport.Autobuz;
import ro.ase.seminar4.simpleFactory.clase.mijloaceTransport.MijloaceTransport;
import ro.ase.seminar4.simpleFactory.clase.mijloaceTransport.Tramvai;
import ro.ase.seminar4.simpleFactory.clase.mijloaceTransport.Troleibuz;

public class FactoryTransport {
    public MijloaceTransport getMijlocTransport(TipTransport tip, String marca, int nrLinie)
    {
        switch (tip){
            case TipTransport.Autobuz->{
                return new Autobuz(nrLinie,marca);
            }
            case TipTransport.Tramvai -> {
                return new Tramvai(nrLinie, marca);

            }
            case TipTransport.Troleibuz -> {
                return  new Troleibuz(nrLinie,marca);
            }
            default -> {
                return null;
            }

        }

    }

}
