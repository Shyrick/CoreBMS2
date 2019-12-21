package Lesson5_3;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

    private String path;

    public MyFileWriter(String path) {
        this.path = path;
    }

    public boolean write(String text) {
        return write(text, false);
    }

    public boolean write(String text, boolean append) {
        try {
            FileWriter writer = new FileWriter(path, append);   // path - путь к файлу для записи данных
            // append = true -
            writer.write(text); // записываем текст в файл (на самом деле в буфер)
            writer.flush();     // записываем из буфера в файл
            writer.close();     // обязательный элемент- закрывает поток записи
        } catch (IOException e) {
            e.printStackTrace();
            return false; // если будет ощибка и файл не запишется, вернем false
        }
        return true; // если файл запишется вернем true
    }
}
