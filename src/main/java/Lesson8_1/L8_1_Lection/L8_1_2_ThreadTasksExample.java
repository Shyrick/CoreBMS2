package Lesson8_1.L8_1_Lection;

import java.util.concurrent.Callable;

public class L8_1_2_ThreadTasksExample {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        Callable <Integer> c = new Callable<Integer>() {
            // У интерфейса Callable есть только метод call() и этот медот не void, а он возвращает тип джененрик!!!
            // т.е. есть возможность передать данные между потоками
            @Override
            public Integer call() throws Exception {
                return null;
            }
        };




    }
}
