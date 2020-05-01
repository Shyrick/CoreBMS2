package Lesson5_2.Vehicle.Cars;

public class SuperCar extends Car {


    public SuperCar(int speed, int mass) {
        super(speed, mass);
    }

    public void superSpeed (){
        this.speed *= 2;
    }
}
