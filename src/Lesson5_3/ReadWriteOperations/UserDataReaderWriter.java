package Lesson5_3.ReadWriteOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataReaderWriter {

    private String path;
    User user;
    User user2;
//    private String userName;
//    private int userAge;
//    private String userFavoriteWord;
//    private int[] array;

    public UserDataReaderWriter(String path) {
        this.path = path;
    }

    public void read() throws FileNotFoundException {   // метод может срывать ошибку, поэтому добавили throws
            // и теперь там, где будем вызывать этот метод, его нужно будет обработать - обернуть в try-catch
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);

        int arrayLength = scanner.nextInt();    // считали длинну массива из первой строки файла
        int [] array = new int[arrayLength];           // создаем массив известной длины
        for(int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();       // считываем сам массив известной длины
        }
         scanner.nextLine();    // холостой nextLine() нужен после nextInt() для обработки символа переноса строки
                                // в конце строки интов
        String userName = scanner.nextLine();   // считываем имя пользователя
        int userAge = scanner.nextInt();        // считываем возраст пользователя

        scanner.nextLine();     // холостой nextLine()

        String  userFavoriteWord = scanner.nextLine(); // считываем любимое слово пользователя
        scanner.close();

        user = new User(userName, userAge, userFavoriteWord, array);
    }

    public  void chengeUser (){
        user.setUserFavoriteWord("newWord");
        user.setUserAge(22);
    }

    public  void writeUserData () throws IOException {
        FileWriter writer = new FileWriter(path);

        writer.write(String.valueOf(user.getArray().length));
        writer.write("\n");
      // или одной строкой  writer.write(user.getArray().length + "\n");  !!! int + String = String

        for(int i = 0; i < user.getArray().length; i++) {
            writer.write(user.getArray()[i] + " ");
        }
        writer.write("\n");
        writer.write(user.getUserName() + "\n");
        writer.write(String.valueOf(user.getUserAge()));
        writer.write("\n");
        writer.write(user.getUserFavoriteWord());
        writer.flush();
        writer.close();
    }

    public void readFromLine(String path) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);

        int arrayLength = scanner.nextInt();
        int [] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        String userName = scanner.next();
        int userAge = scanner.nextInt();
        String  userFavoriteWord = scanner.next();
        scanner.close();

        user = new User(userName, userAge, userFavoriteWord, array);
    }

    public void readFromTwoLine(String path) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);

        int arrayLength = scanner.nextInt();
        int [] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        String userName = scanner.next();
        int userAge = scanner.nextInt();
        String  userFavoriteWord = scanner.next();

        user = new User(userName, userAge, userFavoriteWord, array);

        int arrayLength2 = scanner.nextInt();
        int [] array2 = new int[arrayLength2];
        for(int i = 0; i < arrayLength2; i++) {
            array2[i] = scanner.nextInt();
        }
        String userName2 = scanner.next();
        int userAge2 = scanner.nextInt();
        String  userFavoriteWord2 = scanner.next();
        scanner.close();

        user2 = new User(userName2, userAge2, userFavoriteWord2, array2);
    }


//    public void show() {
    //Вариант без создания User с использованием полей класса
//        System.out.println("User name:\t\t\t" + userName);
//        System.out.println("User age: \t\t\t" + userAge);
//        System.out.println("User favorite word:\t" + userFavoriteWord);
//        System.out.println();
//        System.out.println("Array length = " + array.length);
//        for(int i = 0; i < array.length; i++) {
//            System.out.print("["+i+"]" + array[i] + "   ");
//        }
//    }

    public void show() {
        System.out.println("Array length = " + user.getArray().length);
        for(int i = 0; i < user.getArray().length; i++) {
            System.out.print("["+i+"]" + user.getArray()[i] + "   ");
            if (i ==user.getArray().length-1) System.out.println();
        }
        System.out.println("User name:\t\t\t" + user.getUserName());
        System.out.println("User age: \t\t\t" + user.getUserAge());
        System.out.println("User favorite word:\t" + user.getUserFavoriteWord());
        System.out.println("-----------------------------");
    }

    public void show2() {
        System.out.println("Array length = " + user.getArray().length);
        for(int i = 0; i < user.getArray().length; i++) {
            System.out.print("["+i+"]" + user.getArray()[i] + "   ");
            if (i ==user.getArray().length-1) System.out.println();
        }
        System.out.println("User name:\t\t\t" + user.getUserName());
        System.out.println("User age: \t\t\t" + user.getUserAge());
        System.out.println("User favorite word:\t" + user.getUserFavoriteWord());
        System.out.println("-----------------------------");

        System.out.println("Array2 length = " + user2.getArray().length);
        for(int i = 0; i < user2.getArray().length; i++) {
            System.out.print("["+i+"]" + user2.getArray()[i] + "   ");
            if (i ==user2.getArray().length-1) System.out.println();
        }
        System.out.println("User2 name:\t\t\t" + user2.getUserName());
        System.out.println("User2 age: \t\t\t" + user2.getUserAge());
        System.out.println("User2 favorite word:\t" + user2.getUserFavoriteWord());
        System.out.println("-----------------------------");
    }
}
