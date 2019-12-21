package Lesson3.Arrays;

import java.util.Scanner;

public class L3_p7_BreakExample {

    public static void main(String[] args) {

        int [] array = {0, 1, 2, 3, 100, 1000, -5, 0, -10};

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите элемент массива");
        // вводим с клавиатуры переменную из массива и программа выдает ее индекс в массиве

        int x = scanner.nextInt();

        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
                System.out.println("Х найден. Его индекс = " + i);
                break; // прерывыет итерацию и завершает выплнение цикла (выходит из цикла)
            }
        }
        System.out.println("Конец программы");


    }

}
