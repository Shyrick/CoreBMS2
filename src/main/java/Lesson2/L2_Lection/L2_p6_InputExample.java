package Lesson2.L2_Lection;

import java.util.Scanner;

public class L2_p6_InputExample {

    // Time 2:03
    public static void main(String[] args) {
         // ----------------------------------------------------------
        Scanner scaner = new Scanner(System.in);

        System.out.println("Введите число Х: ");
        int x = scaner.nextInt();

        System.out.println("Вы ввели Х = " + x);
        // --------------------------------------------------

        // Зеленая зона- х лежит в диаппазоне от 0 до 10000
        // и при этом не входит в диаппазон от 1000 до 2000 и от 4000 до 5000

//        boolean isLeft = x < 1000;
//        boolean isCentr = x > 2000 && x < 4000;
//        boolean isRigth = x > 5000;

        System.out.println("Введите RedZoneLeft RedZoneRight RedZone2Left RedZone2Right");
        // в одну строку можно вводить значения разных переменных и раздялять их пробелом.
        // считывание начнется после нажатия Enter

        // Для проверки "от дурака" есть boolean hasNextInt() и т.д. для других типов

        int RedZoneLeft = scaner.nextInt();
        int RedZoneRight = scaner.nextInt();
        int RedZone2Left = scaner.nextInt();
        int RedZone2Right = scaner.nextInt();

        boolean isLeft = x < RedZoneLeft;
        boolean isCentr = x > RedZoneRight && x < RedZone2Left;
        boolean isRigth = x > RedZone2Right;

        boolean result = isLeft || isCentr || isRigth;
        System.out.println("Х = " + x + " входит в зеленый диапазон? - "  + result);




    }

}
