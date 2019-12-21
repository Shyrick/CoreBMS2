package Lesson3.L3_Practice;

import java.util.Scanner;

public class L3_pr_Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите ширину и высоту прямоугольника");
        int whide = scanner.nextInt();
        int hight = scanner.nextInt();

        for (int i = 0; i < hight; i++){
            for (int j = 0; j < whide; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
