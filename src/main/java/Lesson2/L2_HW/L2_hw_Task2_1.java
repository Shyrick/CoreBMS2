package Lesson2.L2_HW;

import java.util.Scanner;

public class L2_hw_Task2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Привет. Как тебя зовут?  \n ");
        String name = scanner.nextLine();

        System.out.print("Привет " + name + ". В каком городе ты живешь? \n" );
        String city = scanner.nextLine();

        System.out.print("А сколько тебе лет?  \n");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Чем ты увлекаешься?  \n");
        String hobby = scanner.nextLine();

        System.out.println();

        System.out.println("Итак, что я запомнил:");
        System.out.println("Тебя зовут:  \t \t" + name);
        System.out.println("Ты живешь в городе: " + city);
        System.out.println("Возраст: \t \t \t" + age);
        System.out.println("Твое хобби: \t \t" + hobby);

        System.out.println();
        String let;
        if (age == 21 || age== 31  || age== 41 || age== 51 || age== 61 || age== 71 || age== 81 || age== 91 ) {
            let = " год";
        } else  if (age == 22 || age== 23  || age== 24 || age== 32 || age== 33 || age == 34 || age== 42 || age== 43 || age== 44 || age== 52 || age== 53 || age== 54 ||
                age == 62 || age== 63  || age== 64 || age== 72 || age== 73 || age == 74 || age== 82 || age== 83 || age== 84 || age== 92 || age== 93 || age== 94){
            let = " года";
        }   else {
            let = " лет";
        }

        System.out.println("Повторю еще раз:");
        System.out.println("Тебя зовут " + name + ", ты живешь в городе " + city + ", \nтебе " + age + let + " и твое хобби это " + hobby);

        System.out.println();

//        System.out.println("Давай теперь проверим.");
//        System.out.println(name + " - это твое имя");
//        System.out.println(city + " - это твой город");
//        System.out.println(age + " - твой возраст");
//        System.out.println(hobby + " - твое хобби");



    }
}
