package ro.ase.seminar1.animals;

public class Tigru extends Animal{
    private String rasa;

    public Tigru(String name, int age, String rasa) {
        super(name, age);
        this.rasa = rasa;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Tigrul " + super.name + " a mancat " + mancare);
    }
}
