package DPComportamentale.Comand.ex2.clase;

public class Ocupare implements Command{

    private Masa masa;
    private String mesaj;
    private String numeClient;

    public Ocupare(Masa masa, String numeClient) {
        this.masa = masa;
        this.mesaj = " a ocupata";
        this.numeClient = numeClient;
    }

    @Override
    public void realiazeazaComanda() {
        masa.executaComanda(mesaj, numeClient);
    }
}
