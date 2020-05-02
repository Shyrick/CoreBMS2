package Lesson7.Json.MyJsonTest;

import Lesson7.Json.Entities.User;
import com.alibaba.fastjson.JSON;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyJsonTest_Main {

    public static void main(String[] args) throws IOException {

        ArrayList<User> users = new ArrayList();
        users.add(new User("Tom", User.Gender.male, 50));
        users.add(new User("Marge", User.Gender.female,30 ));
        users.add(new User("Mike", User.Gender.male, 10));

        MyJsonTest myJsonTest = new MyJsonTest("Test myJsonTest", users);
        System.out.println(myJsonTest);
        System.out.println("---");

        String json = JSON.toJSONString(myJsonTest, true); // если добавить true - сторак будет не линейной,
                                                                    // а в виде удобного json-validator
        System.out.println("Данные из JSON:" + "\n" + json);
        System.out.println("-----");

        FileWriter writer = new FileWriter("files/Lesson7/ForMyJsonTest.txt");
        writer.write(json);
        writer.flush();
        writer.close();

        FileInputStream stream = new FileInputStream("files/Lesson7/ForMyJsonTest.txt");
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");
        String data = scanner.next();

        MyJsonTest myJsonTestFromFile = JSON.parseObject(data, MyJsonTest.class);


        System.out.println("Данные из объекта:" + "\n" + myJsonTestFromFile);
        System.out.println(myJsonTestFromFile.name);








    }
}
