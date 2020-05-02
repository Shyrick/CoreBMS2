package Lesson7.L7_Practice.Task2.Products;

public class TechProduct extends Product {

    public String description;
    public int guaranteeDuration;

    public TechProduct(String name, Double price, String description, int guaranteeDuration) {
        super(name, price);
        this.description = description;
        this.guaranteeDuration = guaranteeDuration;
    }

    @Override
    public String toString() {
        return "TechProduct{" +  super.toString() +
                "description='" + description + '\'' +
                ", guaranteeDuration=" + guaranteeDuration +
                ", ";
    }
}

