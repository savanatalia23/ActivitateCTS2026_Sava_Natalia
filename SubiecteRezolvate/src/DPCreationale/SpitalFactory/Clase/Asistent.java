package DPCreationale.SpitalFactory.Clase;

public class Asistent extends PersonalMedical{
    protected String sef;

    public Asistent(String departament, int numarPacienti, String nume, String sef) {
        super(departament, numarPacienti, nume);
        this.sef = sef;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent: ");
        sb.append("sef='").append(sef).append('\'');
        sb.append(", departament='").append(departament).append('\'');
        sb.append(", numarPacienti=").append(numarPacienti);
        sb.append(", nume='").append(nume).append('\'');
        return sb.toString();
    }

    @Override
    public void afisarePersonal() {
        System.out.println(this.toString());
    }

    public void setSef(String sef) {
        this.sef = sef;
    }
}
