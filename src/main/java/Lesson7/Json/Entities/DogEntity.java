package Lesson7.Json.Entities;

import com.alibaba.fastjson.annotation.JSONField;

public class DogEntity {
    @JSONField(name = "qwerty") //такая запись перед переменной меняет внутри jsonа ее имя
    public String name;                         // name на qwerty но при обратном парсинге в объете все будет без изменений

  // @JSONField(serialize = false) // такая анотация перед переменной позволяет не записывать данную переменную в json
    public int age;               // Но и при обратном парсинге ее значение будет = 0

    public DogEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "DogEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
