package Lesson7.L7_Practice.Task3;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Task3_Main {

    public static String getJsonFromFile (String path) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");
        String data = scanner.next();
        return data;
    }
    public static void main(String[] args) throws FileNotFoundException {

        String json1 = getJsonFromFile ("files/Lesson7/Pr_Task3_1.txt");
        System.out.println(json1);
        MyDoc <String, Integer> myDoc1 = JSON.parseObject(json1, MyDoc.class);
        System.out.println("From file 3_1  with key-'TOM': ");
        System.out.println(myDoc1.data.get("Tom"));

        String json2 = getJsonFromFile ("files/Lesson7/Pr_Task3_2.txt");
        System.out.println(json2);
        MyDoc <String, String> myDoc2 = JSON.parseObject(json2, MyDoc.class);
        System.out.println("From file 3_2  with key-'29': ");
        System.out.println(myDoc2.data.get("29"));

        String json3 = getJsonFromFile ("files/Lesson7/Pr_Task3_3.txt");
        System.out.println(json3);
        MyDoc <String, String> myDoc3 = JSON.parseObject(json3, MyDoc.class);
        System.out.println("From file 3_3  with key-'Tom': ");
        System.out.println(myDoc3.data.get("Tom"));

        String json4 = getJsonFromFile ("files/Lesson7/Pr_Task3_4.txt");
        System.out.println(json4);
        MyDoc <String, String> myDoc4 = JSON.parseObject(json4, MyDoc.class);
        System.out.println("From file 3_4  with key-'60': ");
        System.out.println(myDoc4.data.get("60"));

        String json5 = getJsonFromFile ("files/Lesson7/Pr_Task3_5.txt");
        System.out.println(json5);
        MyDoc <Integer, Integer> myDoc5 = JSON.parseObject(json5, MyDoc.class);
        System.out.println("From file 3_5  with key-'60': ");
        System.out.println(myDoc4.data.get("60"));
    }
}
