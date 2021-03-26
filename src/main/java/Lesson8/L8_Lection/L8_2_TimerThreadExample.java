package Lesson8.L8_Lection;

import java.awt.image.renderable.RenderableImageProducer;

public class L8_2_TimerThreadExample {
    // Time 18:00
26:00
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
