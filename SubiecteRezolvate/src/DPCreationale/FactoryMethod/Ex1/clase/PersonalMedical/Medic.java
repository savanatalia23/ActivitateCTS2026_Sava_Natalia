package DPCreationale.FactoryMethod.Ex1.clase.PersonalMedical;


import DPCreationale.FactoryMethod.Ex1.clase.PersonalSpital;

public class Medic implements PersonalSpital {
    private String name;
    private  int nrOreLucrate;
    private int salariu;
    private  int nrAniStudii;

    public Medic(String name, int nrOreLucrate, int salariu, int nrAniStudii) {
        this.name = name;
        this.nrOreLucrate = nrOreLucrate;
        this.salariu = salariu;
        this.nrAniStudii = nrAniStudii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic: ");
        sb.append("name='").append(name).append('\'');
        sb.append(", nrOreLucrate=").append(nrOreLucrate);
        sb.append(", salariu=").append(salariu);
        sb.append(", nrAniStudii=").append(nrAniStudii);

        return sb.toString();
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println(this.toString());
    }
}
