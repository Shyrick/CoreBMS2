package Lesson3.L3_Practice;

import java.util.Scanner;

public class L3_pr_Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите ширину и высоту прямоугольника");
        int whide = scanner.nextInt();
        int hight = scanner.nextInt();
//  i=0 - х
//  i=n - x
//  j=0 - x
//  j=n - x
        int number = 100;
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < whide; j++) {

                if (i == 0 || i == (hight - 1) || j == 0 || j == (whide - 1) ){
                    System.out.print("xxx ");
                }else {
                    System.out.print(number + " ");
                    number++;
                }
            }
            System.out.println();
        }



    }
}
