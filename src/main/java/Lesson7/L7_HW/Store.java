package Lesson7.L7_HW;

import com.alibaba.fastjson.JSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public String pathToStorage;
    public ArrayList <Fruit> fruits;

//    public Store(String pathToStorage) {
//        this.pathToStorage = pathToStorage;
//    }

    public Store(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    public Store() {
    }

    void addFruits(String pathToDeliveryJsonFile)throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(pathToDeliveryJsonFile);
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");
        String data = scanner.next();
        System.out.println(data);
        Store store1 = JSON.parseObject(data, Store.class);
        System.out.println(store1);


    }

    @Override
    public String toString() {
        return "Store{" +
                "fruits=" + fruits +
                '}';
    }
}
