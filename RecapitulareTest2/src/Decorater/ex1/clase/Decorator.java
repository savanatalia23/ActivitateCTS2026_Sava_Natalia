package Decorater.ex1.clase;

public abstract class Decorator implements IExtrasCont {

    IExtrasCont extras;

    public Decorator(IExtrasCont extras) {
        this.extras = extras;
    }

    @Override
    public void genereazaExtras() {
        extras.genereazaExtras();
    }
    public abstract void adaugaMesaj();
}
