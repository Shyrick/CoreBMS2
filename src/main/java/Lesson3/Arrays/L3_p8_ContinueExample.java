package Lesson3.Arrays;

public class L3_p8_ContinueExample {

    public static void main(String[] args) {

        int [] array = {0, 1, -2, -3, 100, 1000, -5, 0, -10};

        // Задача - найти сумму всех положительных чисел, а отрицательные игнорировать
        int sum = 0;

        // Вариант №1 --------------------------------
//        for (int value: array) {
//            if (value > 0){
//                sum += value;
//            }
//        }
        // Вариант №2 -----------------------------------------
        for (int value: array) {
            if (value <= 0)
                continue; // деллает выход из текущей итерации цикала, но не выходит из цикла
                          // (перехоит к следующей итерации)
            sum += value;
        }

        System.out.println("Сумма положительных элементов summ = " +  sum);
    }
}
