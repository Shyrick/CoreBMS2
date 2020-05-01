package Lesson4.L4_HW;

public class L4_hw_Task3 {
//    Задание 4
//    Написать функцию getMax которая принимает на вход два аргумента в виде чисел.
//    А возвращает максимальное из этих двух.
//    Также, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)
    static int getMax(int a, int b){
        int max = 0;
        if (a > b) return max = a;
    return max = b;
    }
    static float getMax(float a, float b){
        float max = 0;
        if (a > b) return max = a;
        return max = b;
    }
    public static void main(String[] args) {
        System.out.println(getMax(100, 6));
        System.out.println(getMax(8.6f, 7.0f));

    }
}
