package Lesson5_2.entities;

public class A {
    public String text = "---";
    private String text2;
    protected String text3;
    public int value = 1000;

    public A (){

    }

    public A(String text, int value) {
        this.text = text;
        this.value = value;
    }

    public void show (){

        System.out.println("Class A text:  " + text);
        System.out.println("        value: " + value);
    }
}
