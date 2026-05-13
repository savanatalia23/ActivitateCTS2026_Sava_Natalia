package Decorater.ex1.clase;

public class Multumim extends Decorator{

    public Multumim(IExtrasCont extras) {
        super(extras);
    }

    @Override
    public void adaugaMesaj() {
        super.genereazaExtras();
        System.out.println("Va multumim pentru increderea acordata\n");
    }

}
