package Decorater.Farmacie.clase;

public class BonDeCasa implements IBonDeCasa{

    protected String numePacient;

    public BonDeCasa(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void printeaza() {
        System.out.println("S-a printat bonul pentru " +this.numePacient);
    }


}
