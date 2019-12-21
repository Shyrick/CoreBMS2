package Lesson3.L3_HW;

import java.util.Scanner;

public class L3_hw_Task3_notFinished {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите массив");
        int [] temp = new int[4];
        int i = 0;
        do {
            temp[i] = scanner.nextInt();
            i++;
        }while (scanner.hasNext());
        for (int value:temp) {
            System.out.println(value);

        }
    }

}
