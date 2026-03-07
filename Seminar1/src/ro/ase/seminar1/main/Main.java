package ro.ase.seminar1.main;

import ro.ase.seminar1.animals.Lion;
import ro.ase.seminar1.animals.Tigru;
import ro.ase.seminar1.animals.Zebra;
import ro.ase.seminar1.zoo.Zoo;
import ro.ase.seminar1.zoo.ZooKeeper;

public class Main {
    public static void main(String []args){

        ZooKeeper zooKeeper = new ZooKeeper("Andrei");
        Lion firstLion= new Lion("Simba", 4, 160);
        Zebra firstZebra = new Zebra("Zebra", 3, 20);
        Zoo gradinaZoo = new Zoo("Gradina zoo din Brasov", zooKeeper);


        gradinaZoo.adaugaAnimal(firstLion);
        gradinaZoo.adaugaAnimal(firstZebra);
        gradinaZoo.adaugaAnimal(new Tigru("Tigru", 2, "bengalez"));
        gradinaZoo.feedAllAnimals();
    }
}
