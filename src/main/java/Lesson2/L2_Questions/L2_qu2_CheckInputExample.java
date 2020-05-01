package Lesson2.L2_Questions;

import java.util.Scanner;

public class L2_qu2_CheckInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        int value = 0;

        while (true) {
            System.out.println("Введите число");
            str = scanner.nextLine();

            try {
                value = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.err.println("Это не число"); // Вывод красным текстом в канал Eror (Вместо канала out)
            }
        }
        System.out.println("value = " + value);

    }
}
