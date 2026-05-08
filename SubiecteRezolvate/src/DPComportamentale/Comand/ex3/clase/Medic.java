package DPComportamentale.Comand.ex3.clase;

public class Medic {
    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public void preluarePacient(Pacient pacinet){

        System.out.println("Medicul " + this.nume+ " preia " + pacinet.afisareDetalii() + " care are specializarea de " + this.specializare);
    }
}
