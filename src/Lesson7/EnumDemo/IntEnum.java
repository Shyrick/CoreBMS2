package Lesson7.EnumDemo;

public enum  IntEnum {
    MONDAY(1),
    TUSDAY(2),
    WENSDAY (3);

//Можно сделать ENUM с индексом, но для этого нужно создать специальный конструктор
    // Нужна переменная, которая хранит значение индекса
    private final int value;
    // И конструктор, который принимает значение индекса и записывает его в эту переменную
    IntEnum(final int newValue) {
        value = newValue;
    }

    // Для индекса вместо int можно использовать другой тип, например String

    public int getValue() {
        return value;
    }
}
