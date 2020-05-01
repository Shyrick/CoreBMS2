package Lesson5_2.Animals;

public class Dog extends Animal {

    public int fangs; // клыки у собаки (количество клыков)

    public Dog() {
    }

    @Override
    public void sound() {
        System.out.println("гав");
    }

    public Dog(String name, int age, int fangs) {
        super(name, age);
        this.fangs = fangs;
    }

}
