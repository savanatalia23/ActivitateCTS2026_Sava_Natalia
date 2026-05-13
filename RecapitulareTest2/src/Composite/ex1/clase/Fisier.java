package Composite.ex1.clase;

public class Fisier extends Structura{

    public Fisier(String nume) {

        super(nume);
    }

    @Override
    public void afisare(String spatii) {
        System.out.println(spatii+ "Numele fisierului: " + this.nume);
    }
}
