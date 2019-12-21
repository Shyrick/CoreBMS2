package Lesson4.L4_Practice;

public class test {


    static String recTest (int n){
        if (n <= 0) return "";
        String str = String.valueOf(n);
        System.out.println(str);
        return recTest(n-1)+ str;
    }
    static int i = 1;
    static String recTest2 (int n){
        if (i > n) return "";
        String str = String.valueOf(i);
        System.out.println(str);
        i++;
        return str +recTest2(n);
    }

    public static void main(String[] args) {
        System.out.println(recTest(3));
        System.out.println(recTest2(3));
    }
}
