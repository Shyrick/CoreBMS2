package Lesson8_1.L8_1_Lection;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.*;

public class L8_1_6_HTTPDownloadExample {
    // Time 1:46:00

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        Callable<String> httpRequest = () -> {
            URL url = new URL("http://google.com");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET"); // Несть несколько типов Connection():
                                        // GET - получение (загрузка) данных
                                        // POST - отправка (выгрузка) данных
            InputStream inputStream = con.getInputStream(); // Записывем поток, полученный методом con.getInputStream()
                                                            // в переменную inputStream
            InputStreamReader reader = new InputStreamReader(inputStream);
            // Объект класса InputStreamReader будет считывать поток из переменной inputStream
            String html = "";
            int b = 0;
            while ((b = reader.read()) != -1) { // reader.read() возвращает -1 в конце стрима (файла)
                // т.е. мы считываем символ из потока и зависываем его в переменную b, пока метод read() не вернет -1
                html += (char) b;
            }
            return html;
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> future = service.submit(httpRequest);
        System.out.println(future.get());

    }
}
