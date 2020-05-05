package Lesson7.Json.MyJsonTest.MyJsonHashMapExampl.MyJsonDateExample;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class MyJsonDateExample {

    public static void main(String[] args) {
        Date date = new Date();
        MyDate myDate = new MyDate(1, date);

        String json = JSON.toJSONString(myDate);
        System.out.println(json);

        MyDate myDateFromJson = JSON.parseObject(json, MyDate.class);
        System.out.println(myDateFromJson);
    }
}
