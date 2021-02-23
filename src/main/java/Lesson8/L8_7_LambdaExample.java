package Lesson8;

public class L8_7_LambdaExample {


    public static void main(String[] args) {
//        new Thread(new Runnable() {
//                 @Override
//                 public void run() {
//                     System.out.println(Thread.currentThread().getName());
//                 }
//             }).start();
//// Тоже самое можно записать с помощью лямбды
//
//        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
//
//// или вот так
//        Runnable r =() -> System.out.println(Thread.currentThread().getName());
//        new Thread(r).start();

        // или вот так
        Runnable rr =() -> {
            // здесь может быть какой-либо код
            //.....
            System.out.println(Thread.currentThread().getName() + " Hello from lambda");
            // здесь sout будет вызван из потока

        };

        rr.run(); // здесь sout вызовется из main
        new Thread(rr).start();
        // В лямбду можно превратить только интерфейс, который отмечен как @Functional
        // и имеет только один метод
        // и даже от своего интерфеса (с одним методом)

        L8_8_LambdaTestInterface test = () -> {
            System.out.println("blabla");
        };
        test.blabla();

    }


}
