package Lesson4.L4_Questions;

public class RecursionExample {

    static int sum (int x){
        if (x <= 0) return x;
        return sum( x - 1) + x;
    }
    public static void main(String[] args) {

        for (int i = 0; i < 15 ; i++) {
            System.out.println("sum (" + i + ") = " +sum(i));
        }
    }

}
