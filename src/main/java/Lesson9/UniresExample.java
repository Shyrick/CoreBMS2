package Lesson9;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;

public class UniresExample {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://kong.github.io/unirest-java/#requests")
                .asString();
       // response.getStatus(); // вернет код ошибки, например 404 (файл не найден)
                                // 200 - ОК (все хорошо)

        System.out.println("Status code = " + response.getStatus());
        System.out.println("Body = " + response.getBody());

        //   http://database.com/ball/20 - обращение к серверу database.com в категорию boll для получения мяча с id=20
        // тот же запрос в другом формате:
        // http://database.com?type=ball&id=20



    }
}
