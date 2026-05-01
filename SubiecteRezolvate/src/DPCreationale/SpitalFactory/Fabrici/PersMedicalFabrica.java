package DPCreationale.SpitalFactory.Fabrici;

import DPCreationale.SpitalFactory.Clase.Asistent;
import DPCreationale.SpitalFactory.Clase.Brancardier;
import DPCreationale.SpitalFactory.Clase.Medic;
import DPCreationale.SpitalFactory.Clase.Personal;

public class PersMedicalFabrica implements TiPersonalFabrica{

    public Personal getPersonalMdical(TipPersonal tip, String nume, String departament, int nrPacienti, int salariu, String sef, int nrTure) {
        switch (tip){
            case TipPersonalMedical.MEDIC->
            {
                return  new Medic(departament, nrPacienti,nume,salariu);
            }
            case TipPersonalMedical.ASISTENT -> {
                return new Asistent(departament,nrPacienti,nume, sef);
            }
            case TipPersonalMedical.BRANCARDIER -> {
                return new Brancardier(departament,nrPacienti,nume, nrTure);
            }
            default -> throw new IllegalStateException("Unexpected value: " + tip);
        }

    }


    @Override
    public Personal getPersonalNonMedical(TipPersonal tip, String nume, String departament, int nrTure, String receptie, String locatie){
        return getPersonalMdical(tip, nume, departament,20,10,"Ana", 19);
    }
}

