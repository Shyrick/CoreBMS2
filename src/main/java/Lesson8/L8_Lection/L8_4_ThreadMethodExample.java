package Lesson8.L8_Lection;

public class L8_4_ThreadMethodExample {

    static Thread showTimer2 (int timer){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int secconds = 0;
                while (secconds < timer){
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + " " +  ++secconds);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }


                }
                }
            });
            thread.start();
        return thread;
    }



//    static void showTimer (int timer){  // пример метода, в котором создается поток и в который
//        new Thread(new Runnable() {     // можно что-либо передавать (здесь переменная timer)
//            @Override
//            public void run() {
//                int secconds = 0;
//                while (secconds < timer){
//                    try {
//                        Thread.sleep(1000);
//                        System.out.println(Thread.currentThread().getName() + " " +  ++secconds);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                        break;
//                    }
//
//
//                }
//            }
//        }).start();
//    }

//    static int i =0;
    public static void main(String[] args) throws InterruptedException {

        showTimer2(3).join();
        showTimer2(4).join();
        showTimer2(5).join();

//        showTimer(3);
//        showTimer(4);
//        showTimer(5);
//------------------------------------
//        for (i = 0; i < 5; i++) {
//             new Thread(new Runnable() {
//                 @Override
//                 public void run() {
//                     System.out.println("i = " + i); //Вывод будет хаотичным, причем может даже выводить i=5 несколько
//                                                    // раз, т.к. потоки создаются долго, а for работает быстро
//                     // и пока будут создаваться потоки i уже может быть равно 5 (значение при выходе из цикла)
//                 }
//             }).start();
//        }
    }
    // Time 15:00
}
