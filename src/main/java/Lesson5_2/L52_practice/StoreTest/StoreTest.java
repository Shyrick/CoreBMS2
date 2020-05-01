package Lesson5_2.L52_practice.StoreTest;

import Lesson5_2.L52_practice.Products.Smartfone;

public class StoreTest {

    Smartfone[] smartfones;

    public StoreTest(Smartfone[] smartfones) {
        this.smartfones = smartfones;
    }

    public void addSmartfoneToArray (Smartfone newSmartfone){
        Smartfone [] array = new Smartfone[smartfones.length + 1];
        for (int i = 0; i < smartfones.length ; i++) {
            array [i] = smartfones [i];
        }
        array[array.length-1] = newSmartfone;
    }
}
