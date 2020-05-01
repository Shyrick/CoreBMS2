package Lesson6;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
// Коллекция, где каждое значение дожно быть униакальным.
//Не может быть два одинаковых объекта;
//Достоинства - быстрые поиск, вставка, удаление
//Недостатки: нет индекса, и нельзя хранить одинаковые значения

    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(3);

        System.out.println("Вывод через for"); // Можно использовать для вывода всей коллекции
        for (int i : hashSet   ) {
            System.out.println(i);
        }

        // По умолчанию HashSet упорядоченная (по возростанию) коллекция,
        // т.е. не смортя на порядок добавления, будет выводиться 1 2 3 4

        Iterator <Integer> iterator = hashSet.iterator();
        System.out.println("Вывод через iterator");
        while (iterator.hasNext()){
            Integer x = iterator.next();
            System.out.println(x);
        }
        // НО! способ хранения (сортировки) можно изменить
        // Для этого нужно переопределить компаратор (метод сравнения объектов в данной коллекции)
        // Или написать свой компаратор - это класс, имплементирующий интерфейс Compereable
        // и переопределить метод compereTo

//        Comparator <Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
//        };
//        HashSet<Integer> hashSet2 = new HashSet<Integer>(comparator);

        // Конвертируем HashSet в массив
        Integer[] myArray = hashSet.toArray(new Integer[hashSet.size()]);

        System.out.println("Вывод после перевода HashSet в массив");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }
}
