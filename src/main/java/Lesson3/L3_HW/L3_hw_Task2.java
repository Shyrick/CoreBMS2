package Lesson3.L3_HW;

import java.util.Scanner;

public class L3_hw_Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввдеите размер массива");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Ввдеите массив указанной длины");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int[] repeatArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int repeatCount = 0;
            for (int j = 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repeatCount++;
                }
            }
            repeatArray[i] = repeatCount;
        }
        int max = repeatArray[0];
        for (int i = 1; i < repeatArray.length; i++) {
            if (repeatArray[i] > max) {
                max = repeatArray[i];
            }
        }
        System.out.println("Максимальное количество повторений в массиве = " + max);
    }
}