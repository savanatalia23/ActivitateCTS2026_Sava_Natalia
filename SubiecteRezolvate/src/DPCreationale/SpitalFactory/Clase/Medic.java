package DPCreationale.SpitalFactory.Clase;

public class Medic extends PersonalMedical{

    protected int salariu;

    public Medic(String departament, int numarPacienti, String nume, int salariu) {
        super(departament, numarPacienti, nume);
        this.salariu = salariu;
    }

    @Override
    public void afisarePersonal() {
        System.out.println(this.toString());
    }
}
