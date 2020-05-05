package Lesson7.Json.MyJsonTest.MyJsonHashMapExampl.MyJsonDateExample;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class MyDate {

    public Integer number;

    @JSONField(format ="dd/MM/yyyy")
    public Date date;

    public MyDate(Integer number, Date date) {
        this.number = number;
        this.date = date;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "number=" + number +
                ", date=" + date +
                '}';
    }
}
