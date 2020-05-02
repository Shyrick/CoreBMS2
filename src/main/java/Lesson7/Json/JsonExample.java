package Lesson7.Json;

import Lesson7.Json.Entities.DogEntity;
import com.alibaba.fastjson.JSON;

public class JsonExample {

    // Для подлючения библиотеки работающей с JSON ее нужно скачать
    // Мы будем использовать FastJson
    // https://github.com/alibaba/fastjson ... Download ... the latest JAR
    // В папке проекта создаем новую папку libs и скачиваем туда jar-файлл
    // Правой кнопкой мыщи на этом файле и выбираем add as libriary
    // На странице откуда скачивали, можно посмотреть документацию как с ним работать
    //
    //Теперь добавим FastJson не через скачивание jar, а через maven
    //maven будет сам скачивать нужный jar-файл
    //
    //Удалим скачанный jar из папки libs
    //
    //В IDE на имени проекта правый клик и выбираем Add Framework Support ... maven...OK
    //в проекте появился файл pom.xml и сразу открылся в новой вкладке
    // нужно добамить теги  <dependencies>  </dependencies> и внутрь встамить
    // <dependency> ... </dependency> для FastJson cо страницы документации в разделе MAVEN
    // !!! там их две, вторая для android !!!!!
    // Внизу IDE жмем на ссылку в появившемся окне Enable Auto-Import
    //мавен сам скачал последнюю версию FastJson в файле pom.xml прописан нов=мер вервии и он синего цвета
    //Также изменилась структура проекта - появились паки main и  rest
    //
    // Maven - это правильный подход для работы с sdk
    //потом для других библиотек в этот же файл можно будет добавить свою (еще одну) <dependency> ... </dependency>
    //
    //В Мавен перед dependensies добавили тег <build> </build> для корректной работы JDK
    // т.к. Мавен отбрасывает версию JDK назад





    public static String serialazeObject (DogEntity dog){ // запись объекта в Json
        // Импортируем класс JSON
        String json = JSON.toJSONString(dog);
        String json2 = JSON.toJSONString(dog, true); // если добавить true - сторак будет не линейной,
                                                                // а в виде удобного json-validator
        System.out.println(json);
        System.out.println();
        System.out.println("json2: ");
        System.out.println(json2);
        System.out.println();
        return json;
    }

    public static DogEntity parsFromJson (String json){ // метод распаковки Json и объект
       DogEntity dog =  JSON.parseObject(json, DogEntity.class);
                            // в метод нужно передать Json  и ожидаемый на выходе класс объекта
                            // тут DogEntity
        return dog;
    }

    public static void main(String[] args) {

        String json = serialazeObject(new DogEntity("Bobik", 3));
        DogEntity dog = parsFromJson(json);
        System.out.println(dog);

    }


}
