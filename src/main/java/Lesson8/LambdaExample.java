package Lesson8;

public class LambdaExample {1:54:00

    public static void main(String[] args) {
        new Thread(new Runnable() {
                 @Override
                 public void run() {
                     System.out.println(Thread.currentThread().getName());
                 }
             }).start();
// Тоже самое можно записать с помощью лямбды

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

// или вот так
        Runnable r =() -> System.out.println(Thread.currentThread().getName());
        new Thread(r).start();
    }
}
