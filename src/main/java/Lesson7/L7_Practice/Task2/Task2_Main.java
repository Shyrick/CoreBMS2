package Lesson7.L7_Practice.Task2;

import com.alibaba.fastjson.JSON;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2_Main {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream stream = new FileInputStream("files/Lesson7/Pr_Task2.txt");
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");
        String data = scanner.next();


        Holding holding = JSON.parseObject(data, Holding.class);
        System.out.println(holding);

        System.out.println(holding.fruitStore.products.get(0).name);
        System.out.println(holding.fruitStore.products.get(0).weight);
        System.out.println(holding.techStore.products.get(0).name);
        System.out.println(holding.techStore.products.get(0).description);
        System.out.println(holding.animalStore.products.get(0).name);
        System.out.println(holding.animalStore.products.get(0).age);

    }
}
