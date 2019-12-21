package Lesson4.L4_HW;

public class L4_hw_Task5 {
//    Решить задачу 2, без использования циклов. Используя рекурсию.

    static String drowLine (int length){

        if (length <= 0)return "";
        String str = drowLine(length - 1);

        return str = str + "+";
    }
    static String drowRactangWitoutCicl (int a, int b){
        if (b <= 0) return "";
        System.out.print(drowLine(a));
        System.out.println();
        return drowRactangWitoutCicl(a, b-1);
    }

    public static void main(String[] args) {

        System.out.println(drowRactangWitoutCicl(3, 5));


    }
}
