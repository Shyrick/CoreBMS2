package Lesson8.L8_Practice.Task2;

import Lesson7.L7_Practice.Task1.Task1_Text;
import com.alibaba.fastjson.JSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static long sum = 0;
    static long multipl = 1;
    static long divisionSum = 0;
    static long difference = 0;

    public static void culculations (long [] data){
        for (int i = 0; i < data.length ; i++) {
            sum = sum + data [i];
        }
        for (int i = 0; i < data.length ; i++) {
            multipl = multipl * data [i];
        }
        for (int i = 1; i < data.length ; i++) {
            divisionSum = divisionSum + (data [i] / i);
        }
        for (int i = 0; i < data.length ; i++) {
            difference = difference - data [i];
        }
        System.out.println("Summ = " + sum);
        System.out.println("multipl = " + multipl);
        System.out.println("divisionSum = " + divisionSum);
        System.out.println("difference = " + difference);

    }

    public static void culculationsInThread (long [] data){

            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < data.length ; i++) {
                    sum = sum + data [i];
                }
            });
            thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < data.length ; i++) {
                multipl = multipl * data [i];
            }
        });
        thread2.start();

        Thread thread3 = new Thread(() -> {
            for (int i = 1; i < data.length ; i++) {
                divisionSum = divisionSum + (data [i] / i);
            }
        });
        thread3.start();

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < data.length ; i++) {
                difference = difference - data [i];
            }
        });
        thread4.start();

        System.out.println("Summ = " + sum);
        System.out.println("multipl = " + multipl);
        System.out.println("divisionSum = " + divisionSum);
        System.out.println("difference = " + difference);

    }



    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream stream = new FileInputStream("files/Lesson8/L8_Pr2_massive.txt");
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");
        String massive = scanner.next();

        Data data = JSON.parseObject(String.valueOf(massive), Data.class);
//        System.out.println(data);
//        System.out.println(data.numbers[5]);
        long startTime = System.currentTimeMillis();
        culculations (data.numbers);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println("duration = " + duration );

        startTime = System.currentTimeMillis();
        culculationsInThread (data.numbers);
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("duration = " + duration );

    }
}
