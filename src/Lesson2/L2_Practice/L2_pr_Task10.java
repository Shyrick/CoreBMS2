package Lesson2.L2_Practice;

import java.util.Scanner;

public class L2_pr_Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // НЕ ПОЛУЧАЕТСЯ РЕШИТЬ СРЕДСТВАМИ ДАННОГО УРОКА (без if и циклов)


        System.out.println("Введите две строки ");
        // вводить нужно через Enter. В одну строку можно, но нужно три раза нажать Enter
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int index = str1.indexOf(str2);
        int isInLine = str1.compareTo(str2);

        System.out.println(index);
        System.out.println(isInLine);

    }
}
