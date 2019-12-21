package Lesson5_3;

public class FilesMain {

    public static void main(String[] args) {
        MyFileWriter writer = new MyFileWriter("files/lesson5_3/inputExample.txt");//расширение .txt указывать не обязательно
        writer.write("Text for test write to the file\n next string of test\n OK!!!");
    }
}
