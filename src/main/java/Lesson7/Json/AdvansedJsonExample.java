package Lesson7.Json;

import Lesson7.Json.Entities.Group;
import Lesson7.Json.Entities.User;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

public class AdvansedJsonExample {

    public static void main(String[] args) {

        ArrayList <User> users = new ArrayList();
        users.add(new User("Tom", User.Gender.male, 50));
        users.add(new User("Marge", User.Gender.female,30 ));
        users.add(new User("Mike", User.Gender.male, 10));

        Group group = new Group("Baskebol team", "bla bla bla", users);
        String json = JSON.toJSONString(group);
        System.out.println(json);
    }
}
