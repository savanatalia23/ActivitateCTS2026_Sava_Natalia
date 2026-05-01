package DPCreationale.SpitalFactory.Clase;

public class Secretara extends PersonalNonMedical{

    private String locatie;

    public Secretara(String departament, int nrTure, String nume, String locatie) {
        super(departament, nrTure, nume);
        this.locatie = locatie;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Secretara{");
        sb.append("locatie='").append(locatie).append('\'');
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
