package Lesson9;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class GoogleSearchExample {


    public static void main(String[] args) {


        //  https://www.google.com/search?q=cats - так выглядит url для запроса в google поиске - cats
        // в unirest можно тип запроса (здесь search) заменить переменной (здесь variable)
        // и затем подставлть в него нужный параметр (текст запроса)
        HttpResponse<String> response1 = Unirest.get("https://www.google.com/{variable}")
                // variable - имя локальной переменной
                // затем при выполнении в метод routeParam() вместо variable будет подставлено search
                .routeParam("variable", "search")
                .queryString("q", "cats")
                .asString();

        //        HttpResponse<String> response2 = Unirest.get("\"http://localhost/{fruit}")
        //             .routeParam("fruit", "apple")
        // При выполнении запроса вместо fruit будет подставелено apple

        System.out.println(response1.getBody());

    }
}
