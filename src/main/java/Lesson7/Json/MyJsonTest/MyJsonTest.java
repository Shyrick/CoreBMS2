package Lesson7.Json.MyJsonTest;

import Lesson7.Json.Entities.User;

import java.util.ArrayList;

public class MyJsonTest {

    public String name;
    public ArrayList <User> users;

    public MyJsonTest(String name, ArrayList<User> users) {
        this.name = name;
        this.users = users;
    }

    @Override
    public String toString() {
        return "MyJsonTest{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
