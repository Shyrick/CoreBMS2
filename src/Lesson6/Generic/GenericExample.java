package Lesson6.Generic;


import Lesson5_2.Vehicle.Cars.Car;
import Lesson5_3.Polymorfism.Animal.Cat;

public class GenericExample {
    public static void main(String[] args) {
        Dog<Cat> dog1 = new Dog<>(); //  Теперь переменная objT у объекта dog1 может быть только типа Cat
        // Нельзя записать  dog1.objT = new Car(); - будет ошибка
        dog1.objT = new Cat();

        Dog<Car> dog2 = new Dog<>();
        dog2.objT = new Car();

        dog1.getObjT(); // будет возвращать Cat
        dog2.getObjT(); // будет возврацать Car;

    }
}
