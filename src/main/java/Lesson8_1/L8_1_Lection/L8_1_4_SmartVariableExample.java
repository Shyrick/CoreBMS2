package Lesson8_1.L8_1_Lection;

import java.util.Scanner;

public class L8_1_4_SmartVariableExample {
    static String [] book = new String[]{
            "Page 0: text on page0",
            "Page 1: text on page1 ",
            "Page 2: text on page2",
            "Page 3: text on page3",
            "Page 4: text on page4"

    };

    static int countOfPageUpdates = 0;

    public static void main(String[] args) {
        L8_1_4_SmartObject <Integer> page = new L8_1_4_SmartObject<>();
        page.getOnUpdate().add(()-> {                   // добавляем событие,которое будет после ввода числа в консоль
            System.out.println(book[page.getValue()]); // а именно - печатаем нужный элемент массива book [];
        });
//        page.getOnUpdate().add(()-> {                   // добавляем еще одно событие, которое будет выполняться
//            System.out.println("Запускается анимация перелистывания...");
//        });
//      Или можно создать отдельную переменнуюб которая "запускает" анимацию перелистывания
        Runnable runnableAnimation = () -> {
            System.out.println("Запускается анимация перелистывания...");
        };


// Но после пятого перелистывания мы больше не будем перелистывать
// для этого делаем еще одну переменную
        Runnable onFifthUpdate = () -> {
            page.getOnUpdate().remove(runnableAnimation);
        };
// Также нужна переменная котораяя считает количество перелистываний (countOfPageUpdates)
// увеличиваем ее после каждого перелистывания
        Runnable onUpdate = () -> {
            countOfPageUpdates++;
            if (countOfPageUpdates == 5){
                onFifthUpdate.run();
            }
        };
        page.getOnUpdate().add(runnableAnimation); // Зжесь мы добавляем созданные переменные (ранэблы) в массив Ранеблов объекта page
        page.getOnUpdate().add(onUpdate);


        Scanner scanner = new Scanner(System.in);
        while (true){
            int userPage = scanner.nextInt();
            page.setValue(userPage);
        }


    }
}
