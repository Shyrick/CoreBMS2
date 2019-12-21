package Lesson2.L2_Practice;

import java.util.Scanner;

public class L2_pr_Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа А, В , С");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();


        boolean isMaxA = (a > b) & (a > c);
        boolean isMaxB = (b > a) & (b > c);
        boolean isMaxC = (c > a) & (c > b);
        System.out.println("A наибольшее число - " + isMaxA);
        System.out.println("B наибольшее число - " + isMaxB);
        System.out.println("C наибольшее число - " + isMaxC);
        System.out.println();

        boolean isMinA = (a < b) & (a < c);
        boolean isMinB = (b < a) & (b < c);
        boolean isMinC = (c < a) & (c < b);
        System.out.println("A наименьшее число - " + isMinA);
        System.out.println("B наименьшее число - " + isMinB);
        System.out.println("C наименьшее число - " + isMinC);
        System.out.println();

        boolean isMidlA = (a > b) & (a < c) || (a < b) & (a > c);
        boolean isMidlB = (b > a) & (b < c) || (b < a) & (b > c);
        boolean isMidlC = (c > a) & (c < b) || (c < a) & (c > b);
        System.out.println("A между В и С - " + isMidlA);
        System.out.println("B между А и С - " + isMidlB);
        System.out.println("C между А и В - " + isMidlC);


    }
}
