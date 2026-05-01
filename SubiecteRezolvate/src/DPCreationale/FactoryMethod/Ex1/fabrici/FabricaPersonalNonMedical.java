package DPCreationale.FactoryMethod.Ex1.fabrici;


import DPCreationale.FactoryMethod.Ex1.clase.PersonalNonMedical.Receptioner;
import DPCreationale.FactoryMethod.Ex1.clase.PersonalNonMedical.Registrator;
import DPCreationale.FactoryMethod.Ex1.clase.PersonalSpital;
import DPCreationale.FactoryMethod.Ex1.enums.TipPersonalNonMedical;

public class FabricaPersonalNonMedical implements FabricaPersonalSpital{
    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String name, int nrOreLucrate, int salariu, int nrAniStudii) {
        return getPersonalSpital(tip, name, nrOreLucrate,salariu);
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String name, int nrOreLucrate, int salariu) {
        switch (tip){
            case TipPersonalNonMedical.RECEPTIONER -> {
                return new Receptioner(name, nrOreLucrate, salariu);
            }
            case TipPersonalNonMedical.REGISTRATOR -> {
                return  new Registrator(name, nrOreLucrate, salariu);
            }
            default -> {
                return  null;
            }
        }
    }
}
