package Lesson8_1.L8_1Practice;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {

//            Scanner scanner = new Scanner(System.in);
//            String adress = scanner.nextLine();        // files/Lesson8_1/Pr_Task1.txt
        String path = "files/Lesson8_1/Pr_Task1.txt";
        FileInputStream stream = new FileInputStream(path);
        Scanner sc = new Scanner(stream);
        AtomicInteger index = new AtomicInteger(1);
        while (sc.hasNext()) {
            String adress = sc.next();
            Callable<String> httpRequest = () -> {
                URL url = new URL(adress);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                InputStream inputStream = con.getInputStream();

                InputStreamReader reader = new InputStreamReader(inputStream);
                String fileAdress = "files/Lesson8_1/cache/" + index + ".txt";
                FileWriter writer = new FileWriter(fileAdress);

                String html = "";
                int b = 0;
                long startTime = System.currentTimeMillis();

                while ((b = reader.read()) != -1) {
                    html += (char) b;
                    writer.write((char)b);
                }
                writer.flush();
                writer.close();
                long endTime = System.currentTimeMillis();
                long duration = endTime - startTime;
                System.out.println("Файл " + adress + " загружен под именем " + index + " за " + duration + " мс");
                index.getAndIncrement();
                return html;
            };

            ExecutorService service = Executors.newFixedThreadPool(2);
            Future<String> future = service.submit(httpRequest);
//            System.out.println(future.get());
        }
        sc.close();
    }
}
