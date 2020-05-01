package Lesson5_2.Vehicle;

public class Scateboard extends Vehicle {
    public String emery = "наждак";

    public Scateboard(int speed, int mass) {
        super(speed, mass);
    }

    @Override
    public void moove() {
        System.out.println("толкаем ногой " + speed);
    }
}
