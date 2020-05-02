package Lesson7.L7_Practice.Task2.Products;

public abstract class Product {

    public String name;
    public Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", price=" + price +
                ", ";
    }
}
