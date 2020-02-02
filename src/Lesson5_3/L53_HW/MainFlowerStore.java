package Lesson5_3.L53_HW;

import Lesson5_3.L53_HW.Flawers.Rose;

import java.io.FileNotFoundException;

import static Lesson5_3.L53_HW.FlowersLoader.load;

public class MainFlowerStore {

    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
//        flowerStore.sell(1,1,1);
//        flowerStore.sellSequence(2,2,2);
        try {
            load("files/Lesson5_3/L53_HW/Flowers.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
