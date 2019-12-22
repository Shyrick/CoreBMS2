package Lesson5_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDataReader {

    private String path;
    private String userName;
    private int userAge;
    private String userFavoriteWord;
    private int[] array;

    public UserDataReader(String path) {
        this.path = path;
    }

    public void read() throws FileNotFoundException {   // метод может срывать ошибку, поэтому добавили throws
            // и теперь там, где будем вызывать этот метод, его нужно будет обработать - обернуть в try-catch
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);

        int arrayLength = scanner.nextInt();    // считали длинну массива из первой строки файла
        array = new int[arrayLength];           // создаем массив известной длины
        for(int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();       // считываем сам массив известной длины
        }
         scanner.nextLine();    // холостой nextLine() нужен после nextInt() для обработки символа переноса строки
                                // в конце строки интов
        userName = scanner.nextLine();   // считываем имя пользователя
        userAge = scanner.nextInt();        // считываем возраст пользователя

        scanner.nextLine();     // холостой nextLine()

        userFavoriteWord = scanner.nextLine(); // считываем любимое слово пользователя
        scanner.close();
    }

    public void show() {
        System.out.println("User name:\t\t\t" + userName);
        System.out.println("User age: \t\t\t" + userAge);
        System.out.println("User favorite word:\t" + userFavoriteWord);
        System.out.println();
        System.out.println("Array length = " + array.length);
        for(int i = 0; i < array.length; i++) {
            System.out.print("["+i+"]" + array[i] + "   ");
        }
    }
}
1:00:00