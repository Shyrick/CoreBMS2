package Lesson2.L2_Lection;

public class L2_p4_LogicOperatory2 {

    // Time 1:21:00
    public static void main(String[] args) {

        boolean t = true;
        boolean f = false;

        // Оператор && - "логическое И" (логическое умножение)

        boolean result  = t && f;

        // 0 && 0 = 0
        // 1 && 0 = 0
        // 0 && 1 = 0
        // 1 && 1 = 1
        System.out.println(result);
        System.out.println("f && f = " + (f && f));
        System.out.println("t && f = " + (t && f));
        System.out.println("f && t = " + (f && t));
        System.out.println("t && t = " + (t && t));
        System.out.println();
        System.out.println();

        // Оператор || - "логическое ИЛИ" (логичесчкое сложение)

        boolean y = t || f;

        // 0 || 0 = 0
        // 1 || 0 = 1
        // 0 || 1 = 1
        // 1 || 1 = 1

        System.out.println("f || f = " + (f || f));
        System.out.println("t || f = " + (t || f));
        System.out.println("f || t = " + (f || t));
        System.out.println("t || t = " + (t || t));
        System.out.println();

        // Time 1:23:30

        // Проверим, является ли Х в диапазоне от 1000 до 2000

        int x = 1050;
        result = x > 1000 && x < 2000;

        System.out.println("x = " + x  + " (1000 : 2000) = " + result);

        // Проверим, чтоб Х не входил в диапахон от 1000 до 2000

        System.out.println("x = " + x  + " !(1000 : 2000) = " + !result);
        // или
        result = x < 1000 || x > 2000;

        System.out.println();

        // Time 1:30:00

        // Проверить, лежит ли Х в диаппазоне от 0 до 10000
        // и при этом не входит в диаппазон от 1000 до 2000 и от 4000 до 5000

        boolean isLeft = x < 1000;
        boolean isCentr = x > 2000 && x < 4000;
        boolean isRigth = x > 0;

        result = isLeft || isCentr || isRigth;
        System.out.println("x = " + x + "   result = " + result);

        // Time 1:38:00










    }

}
