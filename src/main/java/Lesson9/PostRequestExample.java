package Lesson9;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class PostRequestExample {
    public static void main(String[] args) {

        HttpResponse<String> jsonResponse = Unirest.post("http://httpbin.org/post")
                .header("accept", "application/json")
                .body("{\"parameter\":\"value\", \"foo\":\"bar\"}")
                .asString();

        //Unirest.post("http://localhost")
        //       .field("upload", new File("/MyFile.zip"))
        //       .asEmpty();
        // Так можно отправить файл

        System.out.println(jsonResponse.getBody());
    }
}
