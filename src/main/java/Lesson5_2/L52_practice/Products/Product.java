package Lesson5_2.L52_practice.Products;

public abstract class Product {

    public int id;
    public String name;
    public int amount;
    public  String description;
    public double price;


    public Product( int id, String name, int amount, String description, double price) {

        this.id = id;
        this.name = name;
        this.amount = amount;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public abstract void show();
}
