package Lesson4.L4_HW;
//Написать функцию которая считает в консоли до числа Х.
//        Аргументы функции: число Х
//
//        Например Х = 5.
//        Вывод программы:
//        1
//        2
//        3
//        4
//        5

public class L4_hw_Task1 {

    static int i = 1;
    static int printNumbers (int x){
        if(i >= x) return x;
        System.out.println(i);
        i++;
        return printNumbers(x);
    }

    public static void main(String[] args) {
        System.out.println(printNumbers(5));

    }
}
