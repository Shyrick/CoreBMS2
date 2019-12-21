package Lesson5_2.Vehicle;

public abstract class Vehicle implements Moovable {
    public int speed, mass;

    public Vehicle(int speed, int mass) {
        this.speed = speed;
        this.mass = mass;
    }


//    @Override                 Т.к. на уровне этого класса мы не знаем как именно нужно реализовать этот метод,
//    public void moove() {     мы объявляем класс абстрактный, а его реализацию возмут на себя наследники,
//                              каждый по своему
//    }
}