package Lesson5_3.L52_practice.Products;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductReadWriter {
    String pathToSmartfones;
    String pathToVegetables;
    String pathToWater;

    public ProductReadWriter(String pathToSmartfones, String pathToVegetables, String pathToWater) {
        this.pathToSmartfones = pathToSmartfones;
        this.pathToVegetables = pathToVegetables;
        this.pathToWater = pathToWater;
    }

    public Smartfone [] readSmartfonesFromFile() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(pathToSmartfones);
        Scanner scanner = new Scanner(stream);
        int length = scanner.nextInt();
        Smartfone [] smartfones = new Smartfone[length];
        for (int i = 0; i < smartfones.length ; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int amount = scanner.nextInt();;
            String description = scanner.next();;
            double price = scanner.nextDouble();
            smartfones [i] = new Smartfone(id, name, amount, description, price);
        }
        return smartfones;
    }
    public Vegetable [] readVegetablesFromFile() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(pathToVegetables);
        Scanner scanner = new Scanner(stream);
        int length = scanner.nextInt();
        Vegetable [] vegetables = new Vegetable[length];
        for (int i = 0; i < vegetables.length ; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int amount = scanner.nextInt();
            String description = scanner.next();
            double price = scanner.nextDouble();
            int shelfLife = scanner.nextInt();
            vegetables [i] = new Vegetable(id, name, amount, description, price, shelfLife);
        }
        return vegetables;
    }
    public Water [] readWatersFromFile() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(pathToVegetables);
        Scanner scanner = new Scanner(stream);
        int length = scanner.nextInt();
        Water [] waters = new Water[length];
        for (int i = 0; i < waters.length ; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int amount = scanner.nextInt();
            String description = scanner.next();
            double price = scanner.nextDouble();
            waters [i] = new Water(id, name, amount, description, price);
        }
        return waters;
    }
}
