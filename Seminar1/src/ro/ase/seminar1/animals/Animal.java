package ro.ase.seminar1.animals;

public abstract class  Animal {
    protected String name;
    private int age;
    public abstract void eat( String mancare);

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
