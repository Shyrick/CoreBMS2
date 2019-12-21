package Lesson2.L2_Lection;

// Time 35:00
public class L2_p2_Operands {

    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int x = a + b;

//        x = x - b;
//        x -= b;
//        x += b;
//        x /= b;
//        x *= b;

        int c = b / a;
        //System.out.println("c = " + c);   // вывод 2 т.к. с это int ( нет дробной части)

        float cс = b / a;
        //System.out.println("cc = " + cc); // вывод 2.0 т.к. b и a это int ( нет дробной части)

        float ссс = (float) b / a; // (float) b - приведение int b к типу float

        System.out.println(x);
       System.out.println("ccc = " + ссс); // вывод 2.5
        // Time 40:38
    }
}
