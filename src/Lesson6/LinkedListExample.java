package Lesson6;


import Lesson6.Generic.Dog;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList <Dog> linkedList = new LinkedList<>();
        // Коллекция "связанный список"
        // Значения хранятся в НОДЕ и каждая нода имеет ссылку на следующую ноду (односвязный список)
        // и на предыдущую ноду (двусвязный список)
        // первая  и последняя ноды имеют ссылки на null

        // Достоинства: быстрое добавление и удаление.
        // Недостаток: медленные считывание и запись

        linkedList.addLast(new Dog("ddd", 3)); // Добавляем в конец коллекции
        linkedList.addLast(new Dog("aaa", 4));
        linkedList.addLast(new Dog("ccc", 1  ));

        // У LinkedList нет индексов элементов, поэтому по нему нельзя пройтись циклом
        // Для прохождения по LinkedList использую ИТЕРАТОР
        // Это объект, кот. хранит указатель на одну ноду

        Iterator <Dog> iterator = linkedList.iterator(); // возвращает первую ноду
        // iterator.next(); // Возвращает вторую (следующую ноду)
        // итератор не может идти назад, только вперед
        while (iterator.hasNext()){
            Dog dog = iterator.next();
            System.out.println(dog.getName());

        }


    }
}
