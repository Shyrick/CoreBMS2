package Lesson8_1.L8_1_Lection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class L8_1_1_ThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        // Pool - это набор (группа) потоков, которые создаются и не умирают, а ждут новой задачи
        // так делают, чтобы не тратить время на создание потока
        // ThreadPool возвращает объект Future

     //   service.submit()  метод отправляет задачу на выполнение
        // задачу можно написать тут же в виде лямбды
        for (int i = 0; i < 20; i++) {


            service.submit(() -> {
                System.out.println("Hello from Thread " + Thread.currentThread().getName() + " in ThreadPool ");
            });
        }
// После выполнения всех задач потоки засыпают и ждут новую задачу
        service.submit(() -> {
            System.out.println("Hello AGAIN from Thread " + Thread.currentThread().getName() + " in ThreadPool ");
        });

        service.shutdown(); //- закрывает все потоки после выполнения всех задач
//        теперь вызвать submit() нельзя, т.к. все потоки закрыты!!!
//        service.submit(() -> {
//            System.out.println("Hello from Thread again" + Thread.currentThread().getName() + " in ThreadPool ");
//        });
      // service.shutdownNow() - закрывает все потоки сразу и возвращает список не выполненны х задач
    }
}
