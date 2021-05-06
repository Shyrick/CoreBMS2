package Lesson8_1.L8_1_Lection;

import java.util.concurrent.*;

public class L8_1_2_ThreadTasksExample {

    private static int sum(int [] arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr [i];
        }
        return sum;
    }

    public static int result;

    private static void callable() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        int [] arr = {1, 3, 5, 8, 4, 6, 9, 2, 8, 4, 5, 2};

        Runnable r = new Runnable() {
            @Override
            public void run() {
                result = sum(arr);
            }
        };

        // service.submit() возвращает объет Future
        Future futureRunnable = service.submit(r);
        futureRunnable.get(); // метод get() будет ожидать завершения всей задачи (в доанном случае завершения Runnable)
        System.out.println("Сумма (Runnable) = " + result);


        Callable <Integer> c = new Callable<Integer>() {
            // У интерфейса Callable есть только метод call() и этот медот не void, а он возвращает тип джененрик!!!
            // т.е. есть возможность передать данные между потоками
            @Override
            public Integer call() throws Exception {
                return sum(arr);
            }
        };

        // можно заменить на лямбду
      //  Callable <Integer> c = () -> sum(arr);

        Future <Integer> futureCallable = service.submit(c);
        System.out.println("Сумма (Callable)= " + futureCallable.get());

        service.shutdown(); // если не вызвать, прорамма не завершится
    }

    private static void futureTask() throws ExecutionException, InterruptedException {
        int [] arr =  {1, 4, 7, 2, 4, 6, 4, 4, 5, 9, 7 };

        //FutureTask  в конструкторе принимает либо Сallable либо Runnable
    // Это вариант без лямбды
//        FutureTask <Integer> task = new  FutureTask <Integer>(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                return null;
//            }
//        });

        // Это вариант c лямбдой
        FutureTask <Integer> task = new  FutureTask <Integer>(() -> {
            return sum(arr );
        });
      //  task.run();  -  task запустится в том потоке, где был вызван (тут в main)
        // Мы запутсим в другом потоке
        new  Thread(task).start();
        System.out.println("Суммма (FutureTask) = " + task.get());
        // здесь метод get() тоже (как и в threadPool) ждет выполнения всех задач
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callable();
        futureTask();
    }

}
