package Lesson7.Json.MyJsonTest.MyJsonHashMapExampl;

public class DataGeneric <T>{
    public String name;
    public T objT;

    public DataGeneric(String name, T objT) {
        this.name = name;
        this.objT = objT;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", objT=" + objT +
                '}';
    }
}
