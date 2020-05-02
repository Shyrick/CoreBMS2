package Lesson7.L7_Practice.Task2.Stors;

import Lesson7.L7_Practice.Task2.Products.Animal;

import java.util.ArrayList;

public class AnimalStore extends Store {
    public ArrayList <Animal> products;

    public AnimalStore(String name, String address, ArrayList<Animal> products) {
        super(name, address);
        this.products = products;
    }

    @Override
    public String toString() {
        return "AnimalStore{" +
                "products=" + products +
                "} " + super.toString();
    }
}
