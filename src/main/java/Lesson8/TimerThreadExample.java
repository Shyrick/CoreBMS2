package Lesson8;

import java.awt.image.renderable.RenderableImageProducer;

public class TimerThreadExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                while (true){
                    try {
                        seconds++;
                        Thread.sleep(1000); // Спать 1 секунду
                        System.out.println(seconds);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }

            }
        };


        Thread thread = new Thread(runnable);
        thread.start();
    }
}
