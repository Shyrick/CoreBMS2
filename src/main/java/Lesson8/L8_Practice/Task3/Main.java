package Lesson8.L8_Practice.Task3;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static int check (ArrayList <Ship> ships){
        int count = 0;
        for (int i = 0; i < ships.size(); i++) {
            if (ships.get(i).getHealsPoint() > 0) {
                count++;

            }
        }
        System.out.println("count == " + count);
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        int shipsAmaunt = 8;
        Thread [] threads = new Thread [shipsAmaunt];
        ArrayList <Ship> ships = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < threads.length ; i++) {
            int healsPoint = 1 + rd.nextInt(8);
            int damage = 1 + rd.nextInt(4);
            int coolDown = 1000 + rd.nextInt(4000);
            ships.add( new Ship(i, healsPoint, damage, coolDown));
            System.out.println("Корабль " + i + " вышел в море "  + ships.get(i));
        }

        for (int i = 0; i < threads.length ; i++) {
            final int x = i;
            threads [i] = new Thread(() -> {
                while (check(ships) > 1){

                    System.out.println(Thread.currentThread().getName() + " вызывает метод shoot");
                    try {
//                       if (ships.get(x).getHealsPoint() > 0){
                        ships.get(x).shoot(ships, shipsAmaunt);
//                       }
//                       threads [x].join();
                        System.out.println(Thread.currentThread().getName() + " закончил метод shoot для корабля " + x );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (check(ships) == 1){
                    int index = 0;
                    for (int j = 0; j < ships.size(); j++) {
                        if (ships.get(j).getHealsPoint() > 0) {
                            index = j;

                        }
                    }
                    System.out.println("Бой окончен. Победитель - " + ships.get(index) );
                    
                }
            });
            threads [i].start();

        }
    }
}

