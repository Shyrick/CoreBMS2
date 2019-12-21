package Lesson5_2.Vehicle.Cars;

import Lesson5_2.Vehicle.Vehicle;

public class Car extends Vehicle {

    public String brendName = "Porshe";

    public Car(int speed, int mass) {
        super(speed, mass);
    }


    @Override                // В дочерних класса JeepCar и SuperCar этот метод уже  реализовывать не нужно!!!
    public void moove() {
        System.out.println("жмем на педаль  " + speed);

    }
}
