package Lesson5_2.Vehicle;

public class Bicycle extends Vehicle {

    public String jingle = "дзыинь";

    public Bicycle(int speed, int mass) {
        super(speed, mass);
    }

    @Override
    public void moove() {
        System.out.println("крутим педали " + speed);
    }
}
