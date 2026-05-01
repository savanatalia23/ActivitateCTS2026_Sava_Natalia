package DPCreationale.SpitalFactory.Clase;

public abstract class PersonalNonMedical implements Personal {
    protected  String nume;
    protected String departament;
    protected int nrTure;

    public PersonalNonMedical(String departament, int nrTure, String nume) {
        this.departament = departament;
        this.nrTure = nrTure;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("departament='").append(departament).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", nrTure=").append(nrTure);
        sb.append('}');
        return sb.toString();
    }

    public void afiseazaPersonal(){
    }
}
