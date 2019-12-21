package Lesson2.L2_Practice;

import java.util.Scanner;

public class L2_pr_Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа (разделитель запятая)");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        boolean isequel = (a == b);
        boolean isbiger = (a > b);
        float end = a % b;
        boolean isHasAnd = (end == 0);

        System.out.println("A = " + a + " B = " + b);
        System.out.println("A = B - " + isequel);
        System.out.println("A > B - " + isbiger );
        System.out.println("A делится на В без остатка - " + isHasAnd);
        System.out.println("отсаток от деления - " + end);
    }
}
