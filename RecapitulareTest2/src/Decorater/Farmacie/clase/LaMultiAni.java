package Decorater.Farmacie.clase;

public class LaMultiAni extends Decorator {

    public LaMultiAni(IBonDeCasa bon) {
        super(bon);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        this.adaugaMesaj();
    }

    @Override
    public void adaugaMesaj() {
        System.out.println("la multi ani" );
    }
}
