package Lesson7.L7_HW;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    @JSONField(serialize = false)
    private String pathToStoreStorage;
    public ArrayList <Fruit> fruits;

    public Store(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    public Store(String pathToStoreStorage, ArrayList<Fruit> fruits) {
        this.pathToStoreStorage = pathToStoreStorage;
        this.fruits = fruits;
    }

    public String getPathToStoreStorage() {
        return pathToStoreStorage;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setPathToStoreStorage(String pathToStoreStorage) {
        this.pathToStoreStorage = pathToStoreStorage;
    }

    public void addFruits(String pathToDeliveryJsonFile)throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(pathToDeliveryJsonFile);
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");
        String data = scanner.next();
//        System.out.println(data);
        Store store = JSON.parseObject(data, Store.class);
        for (int i = 0; i < store.fruits.size() ; i++) {
            this.fruits.add(store.fruits.get(i));
        }
//        System.out.println("storeInMetod: " + store.fruits);
//        System.out.println("Path: " + store.getPathToStoreStorage());
    }

    public void save() throws IOException {
        FileWriter writer = new FileWriter(pathToStoreStorage,  false);
//        ArrayList <Fruit> fruitArrayList = this.fruits;
        Store store = new Store(this.fruits);
        String json = JSON.toJSONString(store, true);
        writer.write(json);
        writer.flush();
        writer.close();
    }

    void load () throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(pathToStoreStorage);
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");
        if (scanner.hasNext()){
            String data = scanner.next();
            Store store = JSON.parseObject(data, Store.class);
            for (int i = 0; i < store.fruits.size() ; i++) {
                this.fruits.add(store.fruits.get(i));
            }
        }

    }

    ArrayList<Fruit> getSpoiledFruits(int date){
        ArrayList <Fruit> spoiledFruit =  new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            if ((fruits.get(i).getDeliveryMonth()+fruits.get(i).getShelfLife())< date){
                spoiledFruit.add(fruits.get(i));
            }
        }
        return spoiledFruit;
    }

    ArrayList<Fruit> getSpoiledFruits(FruitType type, int date){
        ArrayList <Fruit> spoiledFruit =  new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            if (((fruits.get(i).getFruitType() == type) && (fruits.get(i).getDeliveryMonth()+fruits.get(i).getShelfLife())< date)){
                spoiledFruit.add(fruits.get(i));
            }
        }
        return spoiledFruit;
    }

    List<Fruit> getAddedFruits(int date){
        ArrayList <Fruit> spoiledFruit =  new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getDeliveryMonth() == date){
                spoiledFruit.add(fruits.get(i));
            }
        }
    return spoiledFruit;
    }

    List<Fruit> getAddedFruits(FruitType type, int date){
        ArrayList <Fruit> spoiledFruit =  new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            if ((fruits.get(i).getFruitType() == type) && fruits.get(i).getDeliveryMonth() == date){
                spoiledFruit.add(fruits.get(i));
            }
        }
        return spoiledFruit;
    }



    @Override
    public String toString() {
        return "Store{" +
                "fruits=" + fruits +
                '}';
    }
}
