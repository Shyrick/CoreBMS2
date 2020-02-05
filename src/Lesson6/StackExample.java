package Lesson6;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // LIFO - last in First out
        Stack<Integer> stack = new Stack<>();
        // stack.peek(); // Считывает крайнее значение БЕЗ ЕГО УДАЛЕНИЯ
        // stack.pop()); // Считывает крайнее значение С УДАЛЕНИЕМ

        stack.push(1); // Поместить (протолкнуить) внуть стека
        stack.push(2);
        stack.push(3);
        System.out.println("peak");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println("pop");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
     //   System.out.println(stack.pop());  Если считывать из пустого стека, будет ошибка

    }
}
