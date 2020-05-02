package Lesson7.Json.MyJsonTest.MyJsonHashMapExampl;

import Lesson5_2.Animals.Cat;
import Lesson6.Generic.Dog;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.HashMap;

public class MyJsonHashMapEx {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("N1", 11);
        map.put("N2", 22);
        map.put("N3", 33);

        String json = JSON.toJSONString(map);
        System.out.println(json);

        TypeReference<HashMap<String, Integer>> typeRef = new TypeReference<HashMap<String, Integer>>() {};
        HashMap<String, Integer> mapFromJson = JSON.parseObject(json, typeRef);
        System.out.println("mapFromJson: ");
        System.out.println(mapFromJson);
        System.out.println(mapFromJson.get("N1"));
    }


}
