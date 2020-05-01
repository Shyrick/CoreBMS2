package Lesson3.If_Else;

import java.util.Scanner;

public class L3_p2_IfElseExample {
    public static void main(String[] args) {
        // time 16:20
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x % 2 == 0){
            System.out.println("Число " + x + " кратно 2");
        }else {
            System.out.println("Число " + x + " не кратно 2");
        }
    }

}
