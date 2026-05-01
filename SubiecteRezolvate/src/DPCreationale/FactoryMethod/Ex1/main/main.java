package DPCreationale.FactoryMethod.Ex1.main;


import DPCreationale.FactoryMethod.Ex1.clase.PersonalSpital;
import DPCreationale.FactoryMethod.Ex1.enums.TipPersonalMedical;
import DPCreationale.FactoryMethod.Ex1.enums.TipPersonalNonMedical;
import DPCreationale.FactoryMethod.Ex1.fabrici.FabricaPersonalMedical;
import DPCreationale.FactoryMethod.Ex1.fabrici.FabricaPersonalNonMedical;
import DPCreationale.FactoryMethod.Ex1.fabrici.FabricaPersonalSpital;

public class main {
    static void main(String[] args) {
        FabricaPersonalSpital fabricaMedici = new FabricaPersonalMedical();
        PersonalSpital asistent = fabricaMedici.getPersonalSpital(TipPersonalMedical.ASISTENT, "Maria", 40, 6700, 4);
        PersonalSpital medic = fabricaMedici.getPersonalSpital(TipPersonalMedical.MEDIC, "Maria", 40, 6700, 4);
        PersonalSpital brancardier = fabricaMedici.getPersonalSpital(TipPersonalMedical.BRANCARDIER, "Maria", 40, 6700, 4);

        FabricaPersonalSpital fabricaNONMedici = new FabricaPersonalNonMedical();
        PersonalSpital receptioner = fabricaNONMedici.getPersonalSpital(TipPersonalNonMedical.RECEPTIONER, "Maria", 40, 6700);
        PersonalSpital registrator = fabricaNONMedici.getPersonalSpital(TipPersonalNonMedical.REGISTRATOR, "Maria", 40, 6700);

       asistent.afiseazaInformatii();
       medic.afiseazaInformatii();
       brancardier.afiseazaInformatii();
       registrator.afiseazaInformatii();
       receptioner.afiseazaInformatii();

    }
}
