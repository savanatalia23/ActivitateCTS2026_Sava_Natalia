package ro.ase.seminar1.zoo;


import ro.ase.seminar1.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    List<Animal> animals;
    ZooKeeper zooKeeper;

    public Zoo(String name,  ZooKeeper zooKeeper) {
        this.name = name;
        this.animals = new ArrayList<Animal>();
        this.zooKeeper = zooKeeper;
    }

    public void  feedAllAnimals(){
        for(Animal animal: animals){
            zooKeeper.feedAnimal( animal);
        }
    }

    public void adaugaAnimal(Animal animal)
    {
        animals.add(animal);
    }

}
