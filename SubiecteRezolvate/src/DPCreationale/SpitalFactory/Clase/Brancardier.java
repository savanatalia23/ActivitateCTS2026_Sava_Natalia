package DPCreationale.SpitalFactory.Clase;

public class Brancardier extends PersonalMedical{

    private int nrTure;

    public Brancardier(String departament, int numarPacienti, String nume, int nrTure) {
        super(departament, numarPacienti, nume);
        this.nrTure = nrTure;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append("nrTure=").append(nrTure);
        sb.append(", departament='").append(departament).append('\'');
        sb.append(", numarPacienti=").append(numarPacienti);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisarePersonal() {
        System.out.println(this.toString());
    }
}
