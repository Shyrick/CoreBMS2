package Lesson8.L8_Questions;

import java.util.Scanner;

public class MultiThreadDemo {

    32^00

    static long fibonacci (int x){
        if (x <- 1) return 1;
        else return fibonacci(x-1)+ fibonacci(x-2);
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int x = scaner.nextInt();
        long startTime = System.currentTimeMillis();
        long f = fibonacci(x);
        long endtime = System.currentTimeMillis();

        long duration = endtime - startTime;
        System.out.println("Fibonacci (" + x + ") = " + f + "\t\t duration = " + duration );

    }

}
