package Lesson8.L8_Practice.Task3;

public class Ship {

    private int healPoint;
    private int damage;
    private int coolDown;

    public Ship(int healPoint, int damage, int coolDown) {
        this.healPoint = healPoint;
        this.damage = damage;
        this.coolDown = coolDown;
    }

    public int getHealPoint() {
        return healPoint;
    }

    public int getDamage() {
        return damage;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void shoot (Ship ship1, Ship ship2){
        ship2.healPoint -= ship1.damage;

    }

    @Override
    public String toString() {
        return "Ship{" +
                "healPoint=" + healPoint +
                ", damage=" + damage +
                ", coolDown=" + coolDown +
                '}';
    }
}