package Lesson3.Arrays;

import java.util.Scanner;

public class L3_p9_BubbleSortExample {

    public static void main(String[] args) {

        // Time 01:54:00
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите длину массива");
        int length = scanner.nextInt();

        System.out.println("Введите массив интов в одну строку через пробел");
        int[] array = new int[length];


        for (int i = 0; i < array.length ; i++) {
            array [i] = scanner.nextInt();
        }
// Сортировка пузырьком
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
            for (int value:array) {
                System.out.print(value + " ");
            }

    }
}
