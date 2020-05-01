package Lesson5_2.Vehicle;

import Lesson5_2.Vehicle.Cars.Car;
import Lesson5_2.Vehicle.Cars.JeepCar;
import Lesson5_2.Vehicle.Cars.SuperCar;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(10, 10 );
        Scateboard scateboard = new Scateboard( 5, 2 );
        Car car = new Car(100, 100);
        JeepCar jeepCar = new JeepCar(80, 120);
        SuperCar superCar = new SuperCar(100, 80);

        bicycle.moove();
        scateboard.moove();
        car.moove();
        jeepCar.moove();
        superCar.moove();
        System.out.println();

        superCar.superSpeed();
        superCar.moove();
    }
}
