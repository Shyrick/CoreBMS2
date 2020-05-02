package Lesson7.L7_Practice.Task2;


import Lesson7.L7_Practice.Task2.Stors.FruitStore;
import Lesson7.L7_Practice.Task2.Stors.TechStore;
import Lesson7.L7_Practice.Task2.Stors.AnimalStore;

public class Holding {

    FruitStore fruitStore;
    TechStore techStore;
    AnimalStore animalStore;

    public Holding(FruitStore fruitStore, TechStore techStore, AnimalStore animalStore) {
        this.fruitStore = fruitStore;
        this.techStore = techStore;
        this.animalStore = animalStore;
    }

    @Override
    public String toString() {
        return "Holding{" +
                "fruitStore=" + fruitStore +  "\n" +
                "        techStore = " + techStore + "\n" +
                "        animalStore=" + animalStore +
                '}';
    }
}
