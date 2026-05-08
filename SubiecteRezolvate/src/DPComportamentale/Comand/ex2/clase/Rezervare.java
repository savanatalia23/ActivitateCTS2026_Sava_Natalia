package DPComportamentale.Comand.ex2.clase;

public class Rezervare implements Command{

    private Masa masa;
    private String mesaj;
    private String numeClient;

    public Rezervare(Masa masa, String numeClient) {
        this.masa = masa;
        this.mesaj =   " a rezervata";
        this.numeClient = numeClient;
    }

    @Override
    public void realiazeazaComanda() {
        masa.executaComanda(mesaj, numeClient);
    }
}
