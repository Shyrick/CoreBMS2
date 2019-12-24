package Lesson5_3.L52_practice;

import Lesson5_3.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDataLineReader {
    private String path;
    User user;

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
    }

    Попробовать считать нескольких юзеров из одного файла
    и записать
}
