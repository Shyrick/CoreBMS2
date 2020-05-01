package Lesson5_2.Animals;

public abstract class Animal { // есла класс абстрактный, то нельзя сосздать его объект (экземпляр)

    public String name;
    public int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sound ();{  // Если в класссе есть абстрактный метод (или поле), класс должен быть abstract

    }
}
