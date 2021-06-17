package Lesson8_1.L8_1_Qestions;

import java.io.File;

public class RunnebleExample {
// Time 02:00

   // static int a = 0;
    public static void main(String[] args) {

        File file = new File("files\\Lesson5_3\\L5_2_pr_Store");
        int a = 0;

        for(int i = 0; i < 1; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Exists = " + file.exists()); //file.exists() - проверка, существует ли данный файл
                  //  a++; // нет тоступа из Runeble к глобальной переменной
                    // Но!!! Елси объявление переменной вынести за пределы медоа main(), то ее можно изменить
                    System.out.println(a); // Причем если не изменять переменную, а только считывать, то все ОК

                }
            };
// Теперь сделаем то же самое через лямбду
// Лямбда полностью идентична (в части областей видимости) обычному Runnable
            Runnable runnable2 = () -> {
                System.out.println("Exists = " + file.exists());
               // a++; // нет тоступа из Runeble к глобальной переменной
                System.out.println(a);  // Причем если не изменять переменную, а только считывать, то все ОК

            };
            runnable.run();
            runnable2.run();


        }
    }
}
