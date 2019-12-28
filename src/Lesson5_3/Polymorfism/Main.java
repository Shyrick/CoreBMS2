package Lesson5_3.Polymorfism;

import Lesson5_2.entities.A;
import Lesson5_3.Polymorfism.Animal.Animal;
import Lesson5_3.Polymorfism.Animal.Cat;
import Lesson5_3.Polymorfism.Animal.Creature;
import Lesson5_3.Polymorfism.Animal.Dog;

public class Main {

    public static void main(String[] args) {

        // Полиморфизм - в один массив положили разные типы
        Animal [] animalsInZoo = {new Cat(), new Dog(),new Cat(), new Dog()};

        Cat cat1 = new Cat();
        Animal animal1 = cat1;
        Creature creature1 = animal1;
        //Можно и  на прямую
        Creature creature2 = new Cat(); // В переменную типа Creature записываем объект типа Cat
        // ВАЖНО!!! Мы не сождаем объект типа Creature (мы не пишем new Creature() ), только создаем переменную этого типа
        // Т.е. переводить тиипы можно только вверх по иерархии наследования.
        // Вот так нельзя!!!
//        Animal animal = new Animal();
//        Dog dog = animal; - ошибка

        cat1.kitty = "123";
        // animal1.kitty = "123" - ошибка. У Animal нет такой перменной

        //но можно так:
        Cat cat2 = (Cat)animal1;
        System.out.println(cat2.kitty);
        // и даже так:
        Creature creature3 = animal1;
        Cat cat3 = (Cat)creature3;
        System.out.println(cat3.kitty);

    }
}
