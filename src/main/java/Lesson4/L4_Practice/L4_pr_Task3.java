package Lesson4.L4_Practice;

////Даны два целых числа A и В (каждое в отдельной строке).
//Выведите все числа от A до B включительно, в порядке возрастания

import java.util.Scanner;

public class L4_pr_Task3 {

    static String recursionNumbersLine (int a, int b){

        if (b < a) return "";
        String str = recursionNumbersLine(a, b-1);
        return  str + " " + b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа А и В");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(recursionNumbersLine(a, b));

    }
}
