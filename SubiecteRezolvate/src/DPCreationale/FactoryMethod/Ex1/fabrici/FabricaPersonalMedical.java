package DPCreationale.FactoryMethod.Ex1.fabrici;


import DPCreationale.FactoryMethod.Ex1.clase.PersonalMedical.Asistent;
import DPCreationale.FactoryMethod.Ex1.clase.PersonalMedical.Brancardier;
import DPCreationale.FactoryMethod.Ex1.clase.PersonalMedical.Medic;
import DPCreationale.FactoryMethod.Ex1.clase.PersonalSpital;
import DPCreationale.FactoryMethod.Ex1.enums.TipPersonalMedical;

public class FabricaPersonalMedical implements FabricaPersonalSpital{

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String name, int nrOreLucrate, int salariu, int nrAniStudii) {
        switch (tip)
        {
            case TipPersonalMedical.MEDIC: return  new Medic(name, nrOreLucrate, salariu, nrAniStudii );
            case TipPersonalMedical.ASISTENT: return  new Asistent(name, nrOreLucrate, salariu, nrAniStudii );
            case TipPersonalMedical.BRANCARDIER: return  new Brancardier(name, nrOreLucrate, salariu, nrAniStudii );

            default:return null;
        }
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String name, int nrOreLucrate, int salariu) {
        return getPersonalSpital(tip, name, nrOreLucrate, salariu, 12);
    }
}
