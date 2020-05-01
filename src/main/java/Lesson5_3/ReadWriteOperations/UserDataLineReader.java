package Lesson5_3.ReadWriteOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDataLineReader {
    private String path;
    User user;
    User user2;

    public UserDataLineReader(String path) {
        this.path = path;
    }

    public void readFromLine(String path) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);

        int arrayLength = scanner.nextInt();
        int [] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        String userName = scanner.nextLine();
        int userAge = scanner.nextInt();
        String  userFavoriteWord = scanner.nextLine();
        scanner.close();

        user = new User(userName, userAge, userFavoriteWord, array);
//
//        int arrayLength2 = scanner.nextInt();
//        int [] array2 = new int[arrayLength];
//        for(int i = 0; i < arrayLength; i++) {
//            array[i] = scanner.nextInt();
//        }
//        String userName2 = scanner.nextLine();
//        int userAge2 = scanner.nextInt();
//        String  userFavoriteWord2 = scanner.nextLine();
//        scanner.close();
//
//        user2 = new User(userName, userAge, userFavoriteWord, array);
    }

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

//    Попробовать считать нескольких юзеров из одного файла
//    и записать
}
