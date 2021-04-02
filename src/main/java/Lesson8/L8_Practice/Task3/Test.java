package Lesson8.L8_Practice.Task3;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random rd = new Random();
        int x;
        do {
            x = rd.nextInt(8);
            System.out.println(x);
        } while ((x < 6 || x == 6) );
        System.out.println("x = " + x);



    }
}
