package Lesson3.If_Else;

import java.util.Scanner;

public class L3_p4_MiniIfExample {
    //Time 32:50

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        //---------------------------------------------------------
        // Тринарный оператор

        String resultV0 = str.length() == 5 ? "ДЖЕКПОТ" : "ПРОВАЛ";
        //               УСЛОВИЕ (if)          TRUE      FALSE(else)

        System.out.println(resultV0);
               //---------------------------------------------------------
        // два варианта одинаковы!!!

        String resultV1 = null;
        if (str.length() == 5){
            resultV1 = "ДЖЕКПОТ !!!";
        }else resultV1 = "ПРОВАЛ";

        System.out.println(resultV1);
        //---------------------------------------------------------

        // Тернарный if как и обычнй if вкладывать один в другой

        String result2 = str.length() == 5 ? "ДЖЕКПОТ" :
                (str.length() == 3 ? "ПРОВАЛ" : "");
        // Здесь "else" обязательно!!!

        // Тоже через if
        String resultV3 = null;
        if (str.length() == 5){
            resultV3 = "ДЖЕКПОТ !!!";
        }else if (str.length() == 3){
            resultV3 = "ПРОВАЛ";
        }
// Stop 51:00





    }

}
