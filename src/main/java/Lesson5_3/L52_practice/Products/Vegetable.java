package Lesson5_3.L52_practice.Products;

public class Vegetable extends Product {
    IdCeeper idCeeper;
    public int shelfLife;

    public Vegetable(int id, String name, int amount, String description, int price, int shelfLife) {
        super(id, name, amount, description, price);
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", shelfLife=" + shelfLife + " days" +
                '}';
    }

    public void show (){
        System.out.println(toString());
    }

}
