package Command.farmacie.clase;


public class PreiaReteta implements IComand{
    protected Farmacist farmacist;

    public PreiaReteta(Farmacist farmacist) {
        this.farmacist = farmacist;
    }

    @Override
    public void executa(Reteta reteta) {
        farmacist.preiaReteta(reteta);
    }


}
