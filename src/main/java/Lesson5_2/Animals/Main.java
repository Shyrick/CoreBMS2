package Lesson5_2.Animals;

public class Main {



    public static void main(String[] args) {
      //  Animal animal = new Animal("sss", 3);   нельза создать экземпляр абстрактного класса!!!

        Cat cat = new Cat("Kitty", 3, "<<< >>>");
        Dog dog =new Dog("Doggy", 5, 100);

        cat.sound();
        dog.sound();


        // !!!! МОЖНО создать объект абстарактного класса

//        Animal animal = new Animal() {
//            @Override
//            public void sound() {
//
//            }
//        };
//        animal.name = "jjj";

    }
}
