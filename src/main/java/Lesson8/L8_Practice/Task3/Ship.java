package Lesson8.L8_Practice.Task3;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Ship {

    private int id;
    private int healsPoint;
    private int damage;
    private int coolDown;

    public Ship(int id, int healPoint, int damage, int coolDown) {
        this.id = id;
        this.healsPoint = healPoint;
        this.damage = damage;
        this.coolDown = coolDown;
    }

    public int getId() {
        return id;
    }

    public int getHealsPoint() {
        return healsPoint;
    }

    public int getDamage() {
        return damage;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void setHealsPoint(int healsPoint) {
        this.healsPoint = healsPoint;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }

    public void shoot (ArrayList <Ship> ships, int shipsAmaunt) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        Random rd = new Random();
        int targetIndex;
        semaphore.acquire();
        if (ships.size() >1) {
//            Thread.sleep(getCoolDown());
//            if (ships.size() >1) {
                do {
                    targetIndex = rd.nextInt(ships.size());
//            System.out.println(targetIndex);
//            if ( ships [targetIndex].healsPoint > 0 ) System.out.println("true");
//            else System.out.println("false");
                }
                while (ships.get(targetIndex) == null || getId() == ships.get(targetIndex).getId());
                System.out.println("Корабль " + getId() + " заряжает орудие силой " + getDamage());


                if (ships.get(targetIndex).healsPoint > 0) {

                    System.out.println("Корабль " + getId() + " стреляет по кораблю  " + targetIndex);
                    ships.get(targetIndex).setHealsPoint(ships.get(targetIndex).getHealsPoint() - getDamage());
                    if (ships.get(targetIndex).healsPoint > 0) {
                        System.out.println("Корабль " + targetIndex + " поврежден. Остаток силы = " + ships.get(targetIndex).healsPoint);
                    } else {
                        System.out.println("Корабль " + targetIndex + " потоплен");
                        ships.remove(targetIndex);
                        shipsAmaunt--;
                    }
                } else {
                    System.out.println("Цель не найдена");

                }
//            }
        }else System.out.println("Победитель корабль " + ships.get(0));

        semaphore.release();
    }


    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", healsPoint=" + healsPoint +
                ", damage=" + damage +
                ", coolDown=" + coolDown +
                '}';
    }
}