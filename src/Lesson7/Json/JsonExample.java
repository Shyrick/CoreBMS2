package Lesson7.Json;

import com.alibaba.fastjson.JSON;

public class JsonExample {

    // Для подлючения библиотеки работающей с JSON ее нужно скачать
    // Мы будем использовать FastJson
    // В папке проекта создаем новую папку libs и скачиваем туда jar-файлл
    // Правой кнопкой мыщи на этом файле и выбираем add as libriary
    // На странице откуда скачивали, можно посмотреть документацию как с ним работать

    public static void main(String[] args) {

        DogEntity dog = new DogEntity("Bobik", 3);

        // Импортируем класс JSON
        String json = JSON.toJSONString(dog);
        System.out.println(json);
    }


}
