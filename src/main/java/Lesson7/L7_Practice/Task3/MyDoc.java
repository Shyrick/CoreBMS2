package Lesson7.L7_Practice.Task3;

import Lesson6.Generic.Dog;

import java.util.HashMap;

public class MyDoc <T, D>{
    public String title;
    public HashMap <T, D> data;

    @Override
    public String toString() {
        return "MyDoc{" +
                "title='" + title + '\'' +
                ", data=" + data +
                '}';
    }
}
