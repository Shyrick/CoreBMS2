package Lesson2.L2_Questions;

import java.io.BufferedInputStream;


import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class L2_qu3_InternetReadExample {
    // Time 51:00
    // Считывание текста из интернета (по URL)


    public static void main(String[] args) throws  IOException {
        URL adress = new URL("https://raw.githubusercontent.com/Shyrick/GoJava10/master/src/HW1/Task1_2.java") ;
        Scanner scanner = new Scanner(new BufferedInputStream(adress.openStream()));

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }
}
