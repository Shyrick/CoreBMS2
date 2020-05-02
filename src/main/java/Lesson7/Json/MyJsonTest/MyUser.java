package Lesson7.Json.MyJsonTest;

import Lesson7.Json.Entities.User;

public class MyUser extends User {
    int weight;

    public MyUser(String name, Gender gender, int age, int weight) {
        super(name, gender, age);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
