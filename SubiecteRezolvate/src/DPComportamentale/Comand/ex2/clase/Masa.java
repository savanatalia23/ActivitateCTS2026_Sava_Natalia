package DPComportamentale.Comand.ex2.clase;

public class Masa {
    private int nrMasa;
    private int capacitate;

    public Masa(int capacitate, int nrMasa) {
        this.capacitate = capacitate;
        this.nrMasa = nrMasa;
    }

    public void executaComanda(String mesaj, String numeClient){
        System.out.println(numeClient+ mesaj + " masa cu numarul " +this.nrMasa + " pentru " + this.capacitate + " persoane.");
    }
}
