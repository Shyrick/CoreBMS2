package Lesson5_2.Animals;

public class Cat  extends  Animal{

    public String mustache; // усы у кота

    public Cat (){
        super();

    }

    @Override
    public void sound() {
        System.out.println("мяу");
    }

    public Cat(String name, int age, String mustache) {
        super(name, age);
        this.mustache = mustache;
    }
}
