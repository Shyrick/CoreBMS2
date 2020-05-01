package Lesson4;

public class L4_p3_RecursionExample {

    static String printNubers (int n){
        if (n <= 0 ) return "";
        String str = printNubers(n-1);
        return  str + " " + n;
    }

    static int factorial (int n){
        if(n <= 0) return 1;
        int value = factorial(n-1);
        return value * n;
    }
    public static void main(String[] args) {
        String str = printNubers(3);
        System.out.println(str);

        for (int i = 0; i < 15; i++) {
            System.out.println("Factorial (" + i + ")" + factorial(i));
        }

    }
}
