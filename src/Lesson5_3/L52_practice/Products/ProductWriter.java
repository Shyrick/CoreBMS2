package Lesson5_3.L52_practice.Products;

import Lesson5_3.L52_practice.Store;

import java.io.FileWriter;
import java.io.IOException;

public class ProductWriter {

    String pathToSmartfones = "files/Lesson5_3/L5_2_pr_Store/Smartfones.txt";
    String pathToVegetables = "files/Lesson5_3/L5_2_pr_Store/Vegetables.txt";
    String pathToWaters = "files/Lesson5_3/L5_2_pr_Store/Waters.txt";

    public ProductWriter() {

    }

    public void writeSmartfonesToFile (Smartfone [] smartfones){
        try {
            FileWriter writer = new FileWriter(pathToSmartfones);
            writer.write(smartfones.length + "\n");
            for (int i = 0; i < smartfones.length; i++) {
                writer.write(smartfones [i].getId() + " ");
                writer.write(smartfones [i].getName() + " ");
                writer.write(smartfones [i].getAmount() + " ");
                writer.write(smartfones [i].getDescription() + " ");
                writer.write(smartfones [i].getPrice() + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeVegetableToFile (Vegetable [] vegetables){
        try {
            FileWriter writer = new FileWriter(pathToVegetables);
            writer.write(vegetables.length + "\n");
            for (int i = 0; i < vegetables.length; i++) {
                writer.write(vegetables [i].getId() + " ");
                writer.write(vegetables [i].getName() + " ");
                writer.write(vegetables [i].getAmount() + " ");
                writer.write(vegetables [i].getDescription() + " ");
                writer.write(vegetables [i].getPrice() + " ");
                writer.write(vegetables [i].getShelfLife() + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeWaterToFile (Water [] waters){
        try {
            FileWriter writer = new FileWriter(pathToWaters);
            writer.write(waters.length + "\n");
            for (int i = 0; i < waters.length; i++) {
                writer.write(waters [i].getId() + " ");
                writer.write(waters [i].getName() + " ");
                writer.write(waters [i].getAmount() + " ");
                writer.write(waters [i].getDescription() + " ");
                writer.write(waters [i].getPrice() + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
