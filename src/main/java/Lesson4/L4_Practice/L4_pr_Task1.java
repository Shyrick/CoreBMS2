package Lesson4.L4_Practice;

//Написать функцию которая принимает на вход массив чисел и возвращает индекс максимального числа.
//Написать функцию которая принимает на вход массив чисел и возвращает максимальное число, используя первую функцию.

import java.util.Random;

public class L4_pr_Task1 {

    static int maxIndex (int [] arr){
        int max = arr [0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr [i] > max) {
                max = arr [i];
                maxIndex = i;
            }
        } return maxIndex;
    }
    static int maxInArray (int [] arr){
        return arr [maxIndex(arr)];
    }

    public static void main(String[] args) {
        int[] array =  {1,7,105, 5, 6};
        System.out.println("Index of max = " + maxIndex(array));
        System.out.println("Max in array = " + maxInArray(array));



    }
}
