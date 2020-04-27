package Lesson7.Json.Entities;

import java.util.ArrayList;

public class Group {
    public String name;
    public String discription;
    public ArrayList <User> users;

    public Group(String name, String discription, ArrayList<User> users) {
        this.name = name;
        this.discription = discription;
        this.users = users;
    }
}
