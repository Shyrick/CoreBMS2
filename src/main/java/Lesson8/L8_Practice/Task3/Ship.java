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

        System.out.println("Корабль " +getId() + " в потоке " +  Thread.currentThread().getName() + " заряжает орудие силой " + getDamage());
        Thread.sleep(getCoolDown());

        if (getHealsPoint() > 0) {
            System.out.println();
            System.out.println("ship id = " + getId() + " HealsPoint() > 0 готовится стрелять"  );
            semaphore.acquire();
            int count = 0;
            int index = 0;

//            System.out.println("count = " + count);
//            if (count > 1) {
                do {
                    System.out.println("Корабль " + getId() + " выбирает цель");
                    targetIndex = rd.nextInt(ships.size());
                    System.out.println(" targetIndex = " + targetIndex);

                    if ( ships.get(targetIndex).healsPoint <= 0) System.out.println("ship " + ships.get(targetIndex).getId()
                            + ".healsPoint < 0");
                    if ( ships.get(targetIndex).healsPoint > 0) System.out.println("ship " + ships.get(targetIndex).getId()+
                            ".healsPoint > 0");
                    if ( ships.get(targetIndex).healsPoint <= 0 || getId() == ships.get(targetIndex).getId())
                        System.out.println("do randome againe");

                }
                while (ships.get(targetIndex).healsPoint <= 0 || getId() == ships.get(targetIndex).getId());
                System.out.println("Корабль " + Thread.currentThread().getName() + " стреляет по кораблю  " + targetIndex);
                ships.get(targetIndex).setHealsPoint(0);
                System.out.println("Корабль " + targetIndex + " потоплен" + ships.get(targetIndex));

//             } else System.out.println("Победитель корабль " + ships.get(index));

        } else {
            System.out.println();
            System.out.println(Thread.currentThread().getName() + " не может стрелять");
            }

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