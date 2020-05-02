package Lesson7.L7_Practice.Task2.Products;

public class Animal extends Product {

   public int age;

    public Animal(String name, Double price, int age) {
        super(name, price);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +super.toString() +
                "age=" + age +
                ", " ;
    }
}
