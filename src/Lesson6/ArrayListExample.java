package Lesson6;

import java.util.ArrayList;

public class ArrayListExample {

    static void printArrayList(ArrayList <Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        ArrayList <Integer> arrayList = new ArrayList<>();
        // ArrayList - коллекция аналог массива. Сам изменяет длину, когда нужо,
        // но делает это медленно и рессурсозатратно
        //НО! быстро записывает и читает данные в/из коллекции
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        printArrayList(arrayList);

        arrayList.remove(2); //Удалим элемент с индексом 2 (третий элемент массива (коллекции)
        printArrayList(arrayList); // Массив сам уменьшил свой размер

        arrayList.add(2, 8); // Добавим новый элемент на 3-ю позицию
        printArrayList(arrayList); // все что было на этой пизции и правее от нее сдвигается вправо

        arrayList.add(2, 5); //Добавим новый элемент на 3-ю позицию
        printArrayList(arrayList); // все что было на этой пизции и правее от нее сдвигается вправо

        arrayList.set(0, 9); // Заменим значение элемента с индексом 0 на новое (с 1 на 9)
        printArrayList(arrayList);

    }
}
