package Lesson7.Json.MyJsonTest.DateJsonTest;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class MyDataJsonTestAtHome {

    public static void main(String[] args) {
       MyDate myDate = new MyDate(1, new Date());
        String json = JSON.toJSONString(myDate);
        System.out.println(json);

        MyDate newMyDate = JSON.parseObject(json,MyDate.class);
        System.out.println(newMyDate.number);
    }
}
