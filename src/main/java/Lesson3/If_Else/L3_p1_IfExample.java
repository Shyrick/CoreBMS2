package Lesson3.If_Else;

import Lesson2.L2_Lection.*;

import java.util.Scanner;

public class L3_p1_IfExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задачи");
        System.out.println("1 - L2_p1_VariableTypes");
        System.out.println("2 - L2_p2_Operands");
        System.out.println("3 - L2_p3_LogicOperatory");
        System.out.println("4 - L2_p4_LogicOperatory2");
        System.out.println("5 - L2_p5_BinaryOperator");
        System.out.println("6 - L2_p6_InputExample");


        int taskNumber = scanner.nextInt();
       // 10799581
        if (taskNumber == 1){
            L2_p1_VariableTypes.main(args);// Если ввели не 0 - запускаем на выполнение класс из предыдущего урока
        }
        if (taskNumber == 2){
            L2_p2_Operands.main(args);
        }
        if (taskNumber == 3){
            L2_p3_LogicOperatory.main(args);
        }
        if (taskNumber == 4){
            L2_p4_LogicOperatory2.main(args);
        }
        if (taskNumber == 5){
            L2_p5_BinaryOperator.main(args);
        }
        if (taskNumber == 6){
            L2_p6_InputExample.main(args);
        }

    }
}
