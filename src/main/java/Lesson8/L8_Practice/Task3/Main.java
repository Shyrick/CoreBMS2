package Lesson8.L8_Practice.Task3;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int shipsAmaunt = 3;
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
                while (ships.size() > 1){
                    try {
                        Thread.sleep(ships.get(x).getCoolDown());
                        ships.get(x).shoot(ships, shipsAmaunt);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            threads [i].start();

        }
    }
}

