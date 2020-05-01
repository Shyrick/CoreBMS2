package Lesson5_2.L52_practice.Products;

public class Smartfone  extends Product {

    IdCeeper idCeeper;


    public Smartfone(int id, String name, int amount, String description, double price) {
        super(id, name, amount, description, price);
    }


    @Override
    public String toString() {
        return "Smartfone{" +
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
