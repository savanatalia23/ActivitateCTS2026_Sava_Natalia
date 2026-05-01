package DPCreationale.FactoryMethod.Ex1.clase.PersonalNonMedical;


import DPCreationale.FactoryMethod.Ex1.clase.PersonalSpital;

public class Registrator implements PersonalSpital {
    private String name;
    private  int nrOreLucrate;
    private int salariu;

    public Registrator(String name, int nrOreLucrate, int salariu) {
        this.name = name;
        this.nrOreLucrate = nrOreLucrate;
        this.salariu = salariu;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Registrator: ");
        sb.append("name='").append(name).append('\'');
        sb.append(", nrOreLucrate=").append(nrOreLucrate);
        sb.append(", salariu=").append(salariu);
        return sb.toString();
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println(this.toString());
    }
}