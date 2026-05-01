package DPCreationale.FactoryMethod.Ex1.fabrici;

import DPCreationale.FactoryMethod.Ex1.clase.PersonalSpital;

public interface FabricaPersonalSpital {
    public PersonalSpital getPersonalSpital (TipPersonal tip, String name, int nrOreLucrate, int salariu, int nrAniStudii);
    public PersonalSpital getPersonalSpital (TipPersonal tip, String name, int nrOreLucrate, int salariu);

}
