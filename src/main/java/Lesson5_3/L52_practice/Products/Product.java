package Lesson5_3.L52_practice.Products;

public abstract class Product {

    public int id;
    public String name;
    public int amount;
    public  String description;
    public int price;


    public Product( int id, String name, int amount, String description, int price) {

        this.id = id;
        this.name = name;
        this.amount = amount;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public abstract void show();
}
