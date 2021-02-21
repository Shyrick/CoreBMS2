package Lesson8;

public class MultiThreadWaitExample {
    static int x = 3;
    static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int seconds = 0;

            while (seconds < x){
                try {
                    seconds++;
                    Thread.sleep(1000); // Спать 1 секунду
                    System.out.println(Thread.currentThread().getName() + " " + seconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + " is finished");
        }
    };
    public static void main(String[] args) throws InterruptedException {

        Thread thread;

        thread = new Thread(runnable);
        thread.start();
        System.out.println("The thread is waiting for timer runing");
        thread.join(); // главный поток будет ждать окончания этого потока
                        //если убрать join, то последовательнось выполнения потоков будет определяться операционной
                        // системой и потоки будут выполняться хаотически
        System.out.println("The main thread is free");
        System.out.println();
        thread = new Thread(runnable);
        thread.start();
        System.out.println("The thread is waiting for timer runing");
        thread.join();
        System.out.println("The main thread is free");
        System.out.println();

        thread = new Thread(runnable);
        thread.start();
        System.out.println("The thread is waiting for timer runing");
        thread.join();
        System.out.println("The end of main thread");
    }
}
