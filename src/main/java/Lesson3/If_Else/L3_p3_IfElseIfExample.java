package Lesson3.If_Else;

import java.util.Scanner;

public class L3_p3_IfElseIfExample {
    // Time 21:30

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String str = scanner.nextLine(); // в длину строки входит и пробел;
        //String str = scanner.next(); // считывает строку до пробела
        // Строка длиной в 5 символов == джекпот
        // Строка длиной в 3 символА == провал

        int lenght = str.length();
        System.out.println("Длина строки = " + lenght);

        if (lenght == 5){
            System.out.println("ДЖЕКПОТ !!!");
        }else {
            if (lenght == 3){
                System.out.println("ПРОВАЛ");
            }
        }



    }
}
