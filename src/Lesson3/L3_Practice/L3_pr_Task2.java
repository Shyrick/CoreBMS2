package Lesson3.L3_Practice;

import java.util.Scanner;

public class L3_pr_Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввдеите размер массива");
        int length = scanner.nextInt();
        int [] array = new int [length];
        int [] newArray = new int [length];

        System.out.println("Ввдеите массив");

        for (int i = 0; i < array.length ; i++) {
            array [i] = scanner.nextInt();
        }

        for (int i = 0; i <array.length ; i++) {
            newArray [i] = array [(array.length -1) - i];
        }

        System.out.println("массив в обратном порядке:");
        for (int value: newArray) {
            System.out.print(value + " ");
        }
    }
}
