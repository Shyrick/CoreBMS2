package Lesson6.Generic;

import java.util.HashMap;

public class HashMapExample  {

// Это колекция, которая хранит объекты в связке КЛЮЧ:ЗНАЧЕНИЕ (Key:Value или K:V)
// HashMap всегда дженерик двух типов <K, V>
// Напирмер можно хранить Собак, а в качестве ключа использовать ее имя
    // КЛЮЧИ ДОЛЖНЫ БЫТЬ УНИКАЛЬНЫЕ!!!
    //Исли записать два объекта с одинаковым ключем, то последний перезапишется на место первого!!!

    public static void main(String[] args) {
        HashMap<String, Dog> dogs = new HashMap<>();

        dogs.put("dog1", new Dog("dog1", 5));
        dogs.put("dog2", new Dog("dog2", 1));
        dogs.put("dog3", new Dog("dog3", 4));
        dogs.put("dog3", new Dog("dog3", 5)); // эта строка перезапишет объект с ключем dog3

        Dog dog = dogs.get("dog3");
        System.out.println(dog.getAge());

        // Если попытаться достать из коллекции несуществующий объект, а точнее искать несуществующий ключ,
        // то вернется null

        dog = dogs.get("000");
        System.out.println(dog);// выводит null



    }
}
