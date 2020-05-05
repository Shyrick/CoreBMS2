package Lesson7.L7_HW;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Main_Store {

    public static void main(String[] args) throws FileNotFoundException {
//        ArrayList <Fruit> fruitArrayList = new ArrayList<>();
//        fruitArrayList.add(new Fruit(FruitType.Chery,10/07/2020", 100));

        Store store =  new Store();
//        Store store = new Store("files/Lesson7/HW/Store.txt");
        store.addFruits("files/Lesson7/HW/Delivery1.txt");
    }
}
