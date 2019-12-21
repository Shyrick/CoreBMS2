package Lesson2.L2_Practice;

import java.util.Scanner;

public class L2_pr_Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два дробных числа (разделитель запятая)");

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float resalt = a + b;

        System.out.println(a + " + " + b + " = " + (resalt));
    }
}
