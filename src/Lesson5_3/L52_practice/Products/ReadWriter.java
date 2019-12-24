package Lesson5_3.L52_practice.Products;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWriter {
    String pathToSmartfones;

    public ReadWriter(String pathToSmartfones) {
        this.pathToSmartfones = pathToSmartfones;
    }

    public void readSmartfones() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(pathToSmartfones);
        Scanner scanner = new Scanner(stream);
        int id = scanner.nextInt();
        String name = scanner.nextLine();
        int amount;
        String description;
        double price;

    }
}
