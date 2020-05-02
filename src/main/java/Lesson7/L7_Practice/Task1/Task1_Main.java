package Lesson7.L7_Practice.Task1;

import com.alibaba.fastjson.JSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1_Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream("files/Lesson7/Pr_Task1.txt");
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");
        String data = scanner.next();

        Task1_Text text1 = JSON.parseObject(data, Task1_Text.class);

        System.out.println("Данные из JSON:" + "\n" + data);
        System.out.println("-----");
        System.out.println("Данные из объекта:" + "\n" + text1);
    }
}
