package Lesson6.Generic;

public class Dog <T> { // Здесь <Т> просто имя тияпа, которое потом будет использоваться
                        //Класс может содержать несколько дженериков  public class Dog <T, D> {
    private String name;
    private int age;
    public T objT; // тип Т нужно обязательно определить в момент создания объекта
//    public D objD; - пример второго переменной дженерика в классе

    // дженерик может использоваться и в методах
    public void show (T t){
        System.out.println(t);
    }
// Джененири может быть возвращаемым типом
    public T getObjT() {
        return objT;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
