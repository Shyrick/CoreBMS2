package Lesson7.Json.MyJsonTest.MyJsonHashMapExampl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.HashMap;

public class MyJsonHasMapGenericEx {

    public static void main(String[] args) {
        HashMap<Integer, DataGeneric<Data>> map = new HashMap<>();

        map.put(1, new DataGeneric<Data>("Name1", new Data(1111)));
        map.put(2, new DataGeneric<Data>("Name2", new Data(2222)));
        map.put(3, new DataGeneric<Data>("Name3", new Data(3333)));
        map.put(4, new DataGeneric<Data>("Name4", new Data(4444)));

        System.out.println(map);

        String json = JSON.toJSONString(map);
        System.out.println(json);
        System.out.println();

        TypeReference<HashMap<Integer, DataGeneric<Data>>> typeReference = new TypeReference<HashMap<Integer, DataGeneric<Data>>>(){};
        HashMap<Integer, DataGeneric<Data>> mapFromJson = JSON.parseObject(json, typeReference);
        System.out.println(mapFromJson);
        System.out.println(mapFromJson.get(2));
        System.out.println(mapFromJson.get(2).name);

    }
}
