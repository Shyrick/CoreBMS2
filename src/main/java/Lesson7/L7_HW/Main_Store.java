package Lesson7.L7_HW;

import java.io.IOException;
import java.util.ArrayList;

public class Main_Store {

    public static void main(String[] args) throws IOException {
        ArrayList <Fruit> fruitArrayList1 = new ArrayList<>();
        Store store1 = new Store( "files/Lesson7/HW/Store1.txt", fruitArrayList1);

//        store1.load();

        store1.addFruits("files/Lesson7/HW/Delivery1.txt");
//        System.out.println("storeaddFruits" + store1.fruits);
//        store1.addFruits("files/Lesson7/HW/Delivery2.txt");
//        store1.addFruits("files/Lesson7/HW/Delivery3.txt");
//        System.out.println("storeaddFruits" + store.fruits);
//        System.out.println("storeaddFruits: " + store.fruits.get(0).getPrice());

//        System.out.println("storeLoad222: " + store.fruits);

//        System.out.println(store.getSpoiledFruits(FruitType.Banana, 12 ));
//        System.out.println(store.getAddedFruits( 4 ));
//        System.out.println(store1.getAddedFruits( FruitType.Apple, 4 ));

        ArrayList <Fruit> fruitArrayList2 = new ArrayList<>();
        Store store2 = new Store( "files/Lesson7/HW/Store2.txt",fruitArrayList2);
//        store2.addFruits("files/Lesson7/HW/Delivery1.txt");
        store2.addFruits("files/Lesson7/HW/Delivery2.txt");

//        System.out.println("storeaddFruits1" + store1.fruits);
//        System.out.println("storeaddFruits2" + store2.fruits);
//        System.out.println("beforeSave" + store2.fruits);
        store1.save();
//        System.out.println("afterSave" + store1.fruits);
        store2.save();
        ArrayList<Store> stores = new ArrayList<>();
        Company company = new Company("files/Lesson7/HW/Company.txt", stores);
        company.stores.add(store1);
        company.stores.add(store2);

        company.save();

        System.out.println(company.getSpoiledFruits(12));



    }
}
