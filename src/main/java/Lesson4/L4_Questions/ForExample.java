package Lesson4.L4_Questions;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int res = 0;
// Нет смысла создавать переменную (тут переменная res) вне цикла, если она используется только в цикле
// Поетому после int x =... после запятой можно написать res = 0
        for (int x = scanner.nextInt(), res = 0; res < x; res++){
            System.out.println(res);
        }
        // Но лучше ввод с кансоли делать вне цикла, для обработки на ошибки
    }
}
