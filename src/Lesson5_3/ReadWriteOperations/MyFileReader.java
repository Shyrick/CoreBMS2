package Lesson5_3.ReadWriteOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {
    private String path;

    public MyFileReader(String path) {
        this.path = path;
    }

    public String readTest(){
        try {
            FileInputStream stream = new FileInputStream(path); // создали поток для считывания из файла по указанному пути
            Scanner scanner = new Scanner(stream); // Сканер будет считывать данные из потока
            // Проверка работы сканера. Выведем в консоль содержимое файла
            // Количество запросов сканера тут соответствует содержанию файла (100 500 1900 fdfdfsl)
            System.out.println(scanner.nextInt());
            System.out.println(scanner.nextInt());
            System.out.println(scanner.nextInt());
            System.out.println(scanner.nextLine());

            String data = "";

            scanner.close(); // поток нужно закрывать
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String readAllFile(){
        try {
            FileInputStream stream = new FileInputStream(path);
            Scanner scanner = new Scanner(stream);
            scanner.useDelimiter("\\Z"); // у сканера есть возможность указать точку окончания считывания - метод useDelimiter
                                        // Здесь используется \\Z = конец файла
                                        // т.е. сканер считает сразу весь файл
            String data = scanner.next();
            scanner.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
