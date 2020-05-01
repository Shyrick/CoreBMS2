package Lesson5_2.L52_practice.Products;

public class Water extends Product{
    IdCeeper idCeeper;

    public Water(int id, String name, int amount, String description, double price) {
        super(id, name, amount, description, price);
    }

    @Override
    public String toString() {
        return "Water{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public  void show (){
        System.out.println(toString());
    }
}
