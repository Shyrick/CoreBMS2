package Lesson7.L7_Practice.Task2.Stors;



import Lesson7.L7_Practice.Task2.Products.Fruit;

import java.util.ArrayList;


public class FruitStore extends  Store {
    public ArrayList <Fruit> products;

    public FruitStore(String name, String address, ArrayList<Fruit> products) {
        super(name, address);
        this.products = products;
    }

    @Override
    public String toString() {
        return "FruitStore{" +
                "products=" + products +
                "} " + super.toString();
    }
}
