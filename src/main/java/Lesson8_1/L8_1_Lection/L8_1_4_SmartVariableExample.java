package Lesson8_1.L8_1_Lection;

import java.util.Scanner;

public class L8_1_4_SmartVariableExample {
    // Есть книга. После ввода номера страницы в консоль, печатаем нужную страницу и зпускаем анимацию
    // перелистывания. Полсе пятого вывода страницы, анимация перелистывания отключается

    static String [] book = new String[]{
            "Page 0: text on page0",
            "Page 1: text on page1 ",
            "Page 2: text on page2",
            "Page 3: text on page3",
            "Page 4: text on page4"

    };

    static int countOfPageUpdates = 0; // переменная для подсчета количества перелистываний

    public static void main(String[] args) {
        L8_1_4_SmartObject <Integer> page = new L8_1_4_SmartObject<>();
        page.getOnUpdate().add(()-> {    // Через геттер getOnUpdate() добавляем в ArrayList <Runnable> onUpdate
            //  событие (лямбду),которое мы будем запускать после ввода числа в консоль,
            // а именно - печатаем нужный элемент массива book [];
            System.out.println(book[page.getValue()]);
        });
//        page.getOnUpdate().add(()-> {                   // добавляем еще одно событие, которое будет выполняться
//            System.out.println("Запускается анимация перелистывания...");
//        });
//      Или можно создать отдельную переменную которая "запускает" анимацию перелистывания
        Runnable runnableAnimation = () -> {
            System.out.println("Запускается анимация перелистывания...");
        };
// Но после пятого перелистывания мы больше не будем перелистывать
// для этого делаем еще одну переменную (лямбду), которая удалить из масива лямбду runnableAnimation
        Runnable onFifthUpdate = () -> {
            page.getOnUpdate().remove(runnableAnimation);
        };
// Также нужна переменная котораяя считает количество перелистываний (countOfPageUpdates)
// Делаем лямбду, которая считает кол-во перелистываний и после пятого перелистывания запускает
// лямбду onFifthUpdate, которая отключает анимацию перелистывания (удаляет нужную лямбду из массива)
        Runnable onUpdate = () -> {
            countOfPageUpdates++;
            if (countOfPageUpdates == 5){
                onFifthUpdate.run();
            }
        };
        page.getOnUpdate().add(runnableAnimation); // Зжесь мы добавляем созданные переменные (ранэблы)
        page.getOnUpdate().add(onUpdate);          // в массив Ранеблов объекта page



        Scanner scanner = new Scanner(System.in);
        while (true){
            int userPage = scanner.nextInt(); // Считываем из консоли номер страницы
            page.setValue(userPage); // вызываем метод setValue(), который запускает все лямбды из массива onUpdate
        }


    }
}
