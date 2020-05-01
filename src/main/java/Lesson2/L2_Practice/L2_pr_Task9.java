package Lesson2.L2_Practice;

import java.util.Scanner;

public class L2_pr_Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите две строки и число");
        // вводить нужно через Enter. В одну строку можно, но нужно три раза нажать Enter
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int a = scanner.nextInt();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(a);

        String newStr = str1.substring(0,a)+ str2 + str1.substring(a);

        System.out.println(newStr);

    }
}
