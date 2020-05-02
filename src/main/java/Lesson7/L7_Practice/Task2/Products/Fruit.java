package Lesson7.L7_Practice.Task2.Products;

public class Fruit extends Product {
    public int weight;

    public Fruit(String name, Double price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{"  + super.toString() +
                "weight=" + weight +
                "} ";
    }
}
