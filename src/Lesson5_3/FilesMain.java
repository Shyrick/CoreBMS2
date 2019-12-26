package Lesson5_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

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
        UserDataReaderWriter dataReader = new UserDataReaderWriter("files/lesson5_3/readUserData.txt");
        try {
            dataReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dataReader.show();
    }

    static void chengeAndWriteUserDataExample() {
        UserDataReaderWriter dataReader = new UserDataReaderWriter("files/lesson5_3/readUserData.txt");
        try {
            dataReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dataReader.show();

        dataReader.chengeUser();
        try {
            dataReader.writeUserData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        dataReader.show();
    }

    static void readFromLineUserDataExample() {
        UserDataReaderWriter dataLineReader = new UserDataReaderWriter(" ");
        try {
            dataLineReader.readFromLine("files/lesson5_3/UserDataLine.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dataLineReader.show();
    }

    static void readFromTwoLineUserDataExample() {
        UserDataReaderWriter dataTwoLineReader = new UserDataReaderWriter(" ");
        try {
            dataTwoLineReader.readFromTwoLine("files/lesson5_3/UserDataTwoLines.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dataTwoLineReader.show2();
    }

    public static void main(String[] args) {
    //    writeExample();
    //   readTestExample();
//        readAllFileExample();
//       loadUserDataExample();
//       chengeAndWriteUserDataExample();
  //      readFromLineUserDataExample();
readFromTwoLineUserDataExample();
//1:00:00

    }
}
