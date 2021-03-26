package Lesson8.L8_Practice.Task3;

import java.util.Random;

public class Main {



    public static void shoot ( Ship [] ships){
        Random rd = new Random();
        int i = rd.nextInt(ships.length);
//        ships [i] =

    }


    public static void main(String[] args) throws InterruptedException {

        Random rd = new Random();


        Thread [] threads = new Thread [3];
        Ship [] ships = new Ship[threads.length];
        int shipsAmaunt = threads.length;
        for (int i = 0; i < threads.length ; i++) {
            int healPoint = 5 + rd.nextInt(5);
            int damage = 1+ rd.nextInt(4);
            int coolDown = 500+ rd.nextInt(1000);
            final int x = i;
            threads [i] = new Thread(() -> {
              ships [x] =  new Ship(healPoint, damage, coolDown);
                System.out.println("i =  " + x + " " + ships [x] );
            });
            threads [i].start();
           // System.out.println("id = " + threads [i].getId());
        }
         Thread.sleep(1000);

        while (shipsAmaunt > 0 ){
            // threads [1];



        }





    }
}
