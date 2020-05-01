package Lesson5_2.entities;

public class MainAB {

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A ("AAA", 100);
        //B b = new B();// Это работает, если в A есть конструктор поумолчению, а в В нет конструктора (тоже конструктор по умолчанию)
//        B b = new B("BBB", 200);
        // b.text2 - к этому полю нет доступа, т.к. оно privet

        B b = new B ("textB", 200, "BBB");

//        a.text = "ABC";
//        a.value = 100;
//        b.text = "BBB";
//        b.value = 200;

        a1.show();
        System.out.println();
        b.show();



    }
}
