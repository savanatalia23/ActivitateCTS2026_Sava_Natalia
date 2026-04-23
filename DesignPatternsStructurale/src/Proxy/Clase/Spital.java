package Proxy.Clase;

public class Spital implements ISpital {
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    public void interneazaPacient(Pacient pacient){
        System.out.println("Pacientul " + pacient.getNume()+ " este internat in spitalul "+ this.nume);
    }
}
