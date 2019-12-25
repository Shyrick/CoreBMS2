package Lesson2.L2_Lection;

public class L2_p1_VariableTypes {

    public static void main(String[] args) {

        byte a = 6; // 8-ми разрядное целое знаковое число от -127 до 128
        short b = 254; // 16-ти разрядное знаковое целое число от -32768 (-2^15) до 32767 (2^15 -1)
        int c = 2000000; // 32-ух разрядное знаковое целое число от -2 147 483 648 (-2^ 31) до 2 147 483 647 (2^31)
        long d = 4000000000L; // 64 bit знаковое целое число от – (2^63) до (2^63 – 1). Тип лонг нужно указывать явно
        //long a = 40 000 000 000L; (в конце числа буква L или l (большая или маленькая).
        // Без буквы L компилятор воспринимает число как integer
        float e = 0.54f; // дробное 32 bit с плавающей точкой. Разделитель ТОЧКА !!!
        // Float Указывается явно буквой f в конце иначе будет тип double
        double n = 2000.0543; //дробное 64 bit с плавающей точкой. Указывается явно буквой d


        boolean g; // 1 bit логический тип true или false

        char h = 'h' ; // 16 bit от 0 до 65535 .Различные символы

        String i = "Строка"; //нет ограничения по разрядности/ тип String внутри себя использует char




    }

}
