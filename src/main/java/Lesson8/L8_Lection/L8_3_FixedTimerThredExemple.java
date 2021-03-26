package Lesson8.L8_Lection;

import java.util.Scanner;

public class L8_3_FixedTimerThredExemple {

//     static int x = 0;
    static int x = 2;
    static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int seconds = 0;

            while (seconds < x){
                try {
                    seconds++;
                    Thread.sleep(1000); // Спать 1 секунду
//                    System.out.println(seconds);
                    System.out.println(Thread.currentThread().getName() + " " + seconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }

        }
    };
    public static void main(String[] args) {

        Thread thread;
//        Scanner scanner = new Scanner(System.in);

//        x = scanner.nextInt();
        thread = new Thread(runnable);
        thread.start();

//        x = scanner.nextInt();
        thread = new Thread(runnable);
        thread.start();

//        x = scanner.nextInt();
        thread = new Thread(runnable);
        thread.start();
    }
}
