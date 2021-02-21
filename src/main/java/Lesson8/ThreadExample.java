package Lesson8;

public class ThreadExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {    // Runnable - интерфейс, который требует переопределения метода run()
            @Override                           // и сделать это можно здесь (при создании экземпляра),
            public void run() {                 // а можно и создав отдельный класс, который будетимплементировать
         // здесь будет код, который будет код  // интерфейс Runnable и уже в этом классе переопределить run()
         // который будет выполняться
         // в потоке
                System.out.println("Hello from new thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
