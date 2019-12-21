package Lesson5_1.L51_Qustions;

public class LambdaExample {

    public static void main(String[] args) {
// Пример, когда lambda не событие (например открытие файла)
        Runnable lambda = () ->{
            System.out.println("I am Lambda");
        };

        lambda.run();
// Пример, когда lambda события
        // Код здесь не работчий, т.к. не до конца прописан код для javaFX

//        EventHandler lambda2 = (event) ->{
//            lambda.run();
//        };
//
//        Button btn = new Button();
//        btn.setOnMouseClicked(lambda2);

        // ---------------------------------------
        // Создаем свою лямбду
        MyLambda myLambda1 = new MyLambda() {
            @Override
            public void run(String str) {
                System.out.println("my lambda1 : " + str);
            }
        };
//  myLambda1 аналогична myLambda2
        MyLambda myLambda2 = (str) ->{
            System.out.println("my lambda2 : " + str);
        };

        myLambda1.run("1111");
        myLambda2.run("2222");

    }
}
