package DPCreationale.SpitalFactory.Clase;

public class Receptioner extends PersonalNonMedical {

    protected String receptie;

    public Receptioner(String departament, int nrTure, String nume, String receptie) {
        super(departament, nrTure, nume);
        this.receptie = receptie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Receptioner{");
        sb.append("receptie='").append(receptie).append('\'');
        sb.append(", departament='").append(departament).append('\'');
        sb.append(", nrTure=").append(nrTure);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisarePersonal() {
        System.out.println(this.toString());
    }
}
