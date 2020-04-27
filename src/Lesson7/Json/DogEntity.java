package Lesson7.Json;

public class DogEntity {
    public String name;
    public int age;

    public DogEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
