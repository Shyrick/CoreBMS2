package Lesson9.YouTube;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class YouTubeApi {
    // Time 1:00:00
    public  static final String API_KEY = "AIzaSyD7gCGAeqMfO4ZCHxlnswefM6w64917GRk";
    public static String search (String query, int maxResulte){
        HttpResponse <String> response =  Unirest.get("https://www.googleapis.com/youtube/v3/search")
                .queryString("key", API_KEY )
                .queryString("part", "snippet")
                .queryString("maxResulte", maxResulte)
                .queryString("q", query)
                .asString();

        return response.getBody();
    }
}
