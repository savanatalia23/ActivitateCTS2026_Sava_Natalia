package DPComportamentale.Comand.clase;

public class Plecare implements Command{

    private Autobuz autobuz;
    private int linie;

    public Plecare(Autobuz autobuz, int linie) {
        this.autobuz = autobuz;
        this.linie = linie;
    }

    @Override
    public void pleacaInCursa() {
        autobuz.pleacaPeTraseu(linie);
    }
}
