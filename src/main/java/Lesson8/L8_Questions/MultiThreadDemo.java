package Lesson8.L8_Questions;

import java.util.Scanner;

public class MultiThreadDemo {
    39:00

    public static void MultiFibonacci (int n, int countOfTreads) throws InterruptedException {
      //  int cores = Runtime.getRuntime().availableProcessors();  - возвращает количество ядер системы

        Thread [] threads = new Thread [countOfTreads];
        for (int i = 0; i < countOfTreads ; i++) {
            threads [i] = new Thread(() -> {
                fibonacci (n);
            });
            threads [i].start();
        }

        for (int i = 0; i < countOfTreads ; i++) {
            threads [i].join();

        }


    }


    public static long fibonacci (int x){
        if (x <- 1) return 1;
        else return fibonacci(x-1)+ fibonacci(x-2);
    }

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        MultiFibonacci (37, 5);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("duration = " + duration );


//        Scanner scaner = new Scanner(System.in);
//        int x = scaner.nextInt();

//        long startTime = System.currentTimeMillis();
//        long f = fibonacci(x);
//        long endTime = System.currentTimeMillis();
//
//        long duration = endTime - startTime;
//        System.out.println("Fibonacci (" + x + ") = " + f + "\t\t duration = " + duration );

    }

}
