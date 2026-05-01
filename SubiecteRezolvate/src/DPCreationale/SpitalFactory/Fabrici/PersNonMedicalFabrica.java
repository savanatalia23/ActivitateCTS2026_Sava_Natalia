package DPCreationale.SpitalFactory.Fabrici;


import DPCreationale.SpitalFactory.Clase.Personal;
import DPCreationale.SpitalFactory.Clase.Receptioner;
import DPCreationale.SpitalFactory.Clase.Secretara;

public class PersNonMedicalFabrica implements TiPersonalFabrica {

    @Override
    public Personal getPersonalMdical(TipPersonal tip, String nume, String departament, int nrPacienti, int salariu, String sef, int nrTure) {
        return getPersonalNonMedical(tip, nume, departament, 21,"Pneo", "Baneasa");
    }

    @Override
    public Personal getPersonalNonMedical(TipPersonal tip, String nume, String departament, int nrTure, String receptie, String locatie) {
        switch (tip) {
            case TipPersonalNonMedical.RECEPTIONER -> {
                return new Receptioner(departament,nrTure, nume, receptie);
            }
            case TipPersonalNonMedical.SECRETARA -> {
                return new Secretara(departament,nrTure, nume, locatie);
            }
            default -> throw new IllegalStateException("Unexpected value: " + tip);
        }
    }
}
