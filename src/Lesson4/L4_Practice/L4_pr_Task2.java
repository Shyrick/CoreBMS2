package Lesson4.L4_Practice;

//    Написать рекурсивную функцию возведения числа-Х в степень-N

public class L4_pr_Task2 {

   // Обычный вариант

    static long exponentiation (int x, int n){
        if (n <= 0) return 1;
        return exponentiation(x, n-1) * x;
    }
    // Перевернутый вариант - не работает!!!
//    static int i = 0;
//    static long exponentiation2 (int x, int n){
//
//        if (i > n) return 1;
//            i++;
//        return exponentiation2(x, n-1) * x;
//    }


    public static void main(String[] args) {
        System.out.println(exponentiation(3, 3));
//        System.out.println(exponentiation2(3, 3));
    }
}
