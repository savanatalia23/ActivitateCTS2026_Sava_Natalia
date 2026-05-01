package DPCreationale.SpitalFactory.Fabrici;


import DPCreationale.SpitalFactory.Clase.Personal;

public interface TiPersonalFabrica {
    public Personal getPersonalMdical(TipPersonal tip, String nume, String departament, int nrPacienti, int salariu, String sef, int nrTure);
    public Personal getPersonalNonMedical(TipPersonal tip, String nume, String departament, int nrTure, String receptie, String locatie);
}
