package DPCreationale.SpitalFactory.Clase;

public abstract class PersonalMedical implements Personal {
    protected  String nume;
    protected String departament;
    protected  int numarPacienti;

    public PersonalMedical(String departament, int numarPacienti, String nume) {
        this.departament = departament;
        this.numarPacienti = numarPacienti;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical: ");
        sb.append("departament='").append(departament).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", numarPacienti=").append(numarPacienti);

        return sb.toString();
    }

    public void afiseazaPersonal(){
    }


}
