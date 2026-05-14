package Decorater.Farmacie.clase;

public abstract class Decorator implements IBonDeCasa {

    IBonDeCasa bon ;

    public Decorator(IBonDeCasa bon) {
        this.bon = bon;
    }

    @Override
    public void printeaza() {
        bon.printeaza();
    }

    public abstract void adaugaMesaj();
}
