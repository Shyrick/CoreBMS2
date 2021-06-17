package Lesson8_1.L8_1Practice;

import javafx.scene.transform.Scale;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;

public class Task1 {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {

//            Scanner scanner = new Scanner(System.in);
//            String adress = scanner.nextLine();        // files/Lesson8_1/Pr_Task1.txt
        String path = "files/Lesson8_1/Pr_Task1.txt";
        FileInputStream stream = new FileInputStream(path);
        Scanner sc = new Scanner(stream);

//        while (sc.hasNext()) {
            String adress = sc.next();


            Callable<String> httpRequest = () -> {
                URL url = new URL(adress);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");

                InputStream inputStream = con.getInputStream();

                InputStreamReader reader = new InputStreamReader(inputStream);
                FileWriter writer = new FileWriter("files/Lesson8_1/cache/ggg.mp3");
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

                return html;
            };

            ExecutorService service = Executors.newFixedThreadPool(2);
            Future<String> future = service.submit(httpRequest);
            System.out.println(future.get());
//        }
        sc.close();
    }
}
