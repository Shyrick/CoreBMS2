package Lesson5_3;

import java.io.File;
import java.io.FileNotFoundException;

public class FilesMain {

    public static void writeExample (){
        MyFileWriter writer = new MyFileWriter("files/Lesson5_3/inputExample.txt"); //расширение .txt указывать не обязательно
        // путь указывается относительно места, откуда запускается проект
        // сейчас это корень данного проекта, т.к. мы запускаем из Idea
        writer.write("Text for test write to the file\n next string of test\n OK!!!");

        MyFileWriter writer2 = new MyFileWriter("files" + File.separatorChar
                + "lesson5_3" + File.separatorChar
                + "inputExample2.txt");   // пример пути к файлу не зависимой от операционной системы
        writer2.write("123\n000\n   +++");
    }

    public static void readTestExample (){
        MyFileReader reader = new MyFileReader("files/Lesson5_3/readTestExample.txt");
        reader.readTest();
    }
    public static void readAllFileExample (){
        MyFileReader reader = new MyFileReader("files/Lesson5_3/readAllFileExample.txt");
        System.out.println(reader.readAllFile());
    }

    static void loadUserDataExample() {
        UserDataReader dataReader = new UserDataReader("files/lesson5_3/readUserData.txt");
        try {
            dataReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dataReader.show();
    }

    public static void main(String[] args) {
    //    writeExample();
    //   readTestExample();
//        readAllFileExample();
       loadUserDataExample();

    }
}
