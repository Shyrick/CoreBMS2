package Lesson5_3.ReadWriteOperations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderFromQuestion6 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("files/Lesson5_3/FileReaderFromQuestion6.txt"));

        char[] buffer = new char[4];
        int count = buffer.length;
        while (count>=buffer.length){
            count = fileReader.read(buffer, 0, buffer.length); // Считать из массива buffer с позиции 0 д
                                                                    // до позиции buffer.length, т.е. весь массив

//        while(fileReader.ready()) {                       // Более короткий вариант
//            fileReader.read(buffer, 0, buffer.length);

            for(char c : buffer) {
                System.out.print(c);
            }
        }
    }
}
