package Lesson4.L4_HW;

import java.util.Scanner;

public class L4_hw_Task2 {
    // Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
//       Аргументы функции: ширина прямоугольника в символах, высота прямоугольника в символах
//
//        Например 3 на 2
//        Вывод программы:
//        + + +
//        + + +
//        Задание 3
//        Перегрузить функцию drawRectangle (задание 2) таким образом, чтобы она могла принимать на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами
//
//        Например 2
//        Вывод программы:
//        + +
//        + +
//
//        Например 3
//        Вывод программы:
//        + + +
//        + + +
//        + + +

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите ширину прямоугольника");
        int length = scanner.nextInt();
        System.out.println("ВВедите высоту прямоугольника");
        int higth = scanner.nextInt();

        for (int i = 0; i <length ; i++) {
           if (i>0) System.out.println();
            for (int j = 0; j < higth ; j++) {
                System.out.print("+");

            }

        }


    }
}
