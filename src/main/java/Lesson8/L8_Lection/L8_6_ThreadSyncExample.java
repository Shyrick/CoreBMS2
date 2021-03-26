package Lesson8.L8_Lection;

import java.util.concurrent.Semaphore;

public class L8_6_ThreadSyncExample {

    static Semaphore semaphore = new Semaphore(1);
    // Число в конструкторе это количество потоков
    // которые будут одновременно выполняться внутри семафора
    // Семафор - это ограничители начала и конца кода, который должен выполняться потоком/потоками, без прерывания
    // другими (случайными/ не нужными) потоками

//    static Runnable runnable = new Runnable() {   // Можно в майне сразу создавать поток,
//        @Override                                 // в него передавать Runnable
//        public void run() {                       // и на нем (на потоке) вызывать метод start
//
//        }
//    };

    static void WriteDataToDatabase() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Ожидает семафор");
        semaphore.acquire();  // метод вызывается перед кодом, который должен выполнсятся синхронизированно
        System.out.println(Thread.currentThread().getName() + " Семафор получен");
       // Здесь как будто код, который пишет данные в базу данных
        // только один поток может одновременно делать запись данных!!!
        System.out.println(Thread.currentThread().getName() + " is writing data to database");
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + " Освобождается семафор");
        semaphore.release();  // конец синхронизированного кода
        System.out.println(Thread.currentThread().getName() + " Семафор освобожден");
    }

    public static void main(String[] args) {
// Создаем потоки:
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        WriteDataToDatabase();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            System.out.println(Thread.currentThread().getName() + " " + i + " Запущен");
        }

    }
}
