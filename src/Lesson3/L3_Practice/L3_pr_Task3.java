package Lesson3.L3_Practice;

import java.util.Scanner;

public class L3_pr_Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввдеите размер массива A");
        int lengthA = scanner.nextInt();
        int [] arrayA = new int [lengthA];

        System.out.println("Ввдеите массив A");
        for (int i = 0; i < arrayA.length ; i++) {
            arrayA [i] = scanner.nextInt();
        }

        System.out.println("Ввдеите размер массива B");
        int lengthB = scanner.nextInt();
        int [] arrayB = new int [lengthB];

        System.out.println("Ввдеите массив B");
        for (int i = 0; i < arrayB.length ; i++) {
            arrayB [i] = scanner.nextInt();
        }
        int lengthC = (lengthA >= lengthB)? lengthA :  lengthB;
        int [] arrayC = new int [lengthC];
        if (lengthA >= lengthB) {
            int[] newArrayB = new int[lengthC];
            for (int i = 0; i < arrayB.length; i++) {
                newArrayB[i] = arrayB[i];
            }
            for (int i = 0; i < arrayC.length; i++) {
                arrayC[i] = arrayA[i] + newArrayB[i];
            }

        }else {
                int [] newArrayA = new int[lengthC];
                for (int i = 0; i < arrayA.length; i++) {
                    newArrayA[i] = arrayA[i];
                }
                for (int i = 0; i < arrayC.length; i++) {
                    arrayC[i] = newArrayA[i] + arrayB[i];
                }
            }


        for (int value: arrayC){
            System.out.print(value + " ");
        }







    }
}
