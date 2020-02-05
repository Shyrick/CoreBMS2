package Lesson6;

import java.util.LinkedList;

public class QueueExampele {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.push(1); //
        queue.push(2);
        queue.push(3);

//        queue.peek();// считывает первый элемент без удаления
//        queue.peekFirst();
//        queue.peekLast();
//        queue.poll(); // считывает первый элемент с удалением//
//        queue.pop();// считывание с удаление по типу Stack

//        System.out.println(queue.pollFirst()); // Ваывод 3 !!!! Работает как STACK !!!
//        System.out.println(queue.pollLast()); //Вывод 1   !!!! Работает как QUEUE !!!

//        System.out.println(queue.pop());  // Вывод 3 (работет как стэк)
//        System.out.println(queue.peek()); // Вывод 3 (работет как стэк)
        System.out.println(queue.poll()); // Вывод 3 (работет как стэк)

        1^42^00
    }
}
