package Lesson3.Arrays;

public class L3_p5_ArrayExample {
    public static void main(String[] args) {

        int [] array1 = {0, 1, 2,};
        System.out.println(array1[1]); // Вывод второго элемента массива (элемента с индексом 1)
        array1[1]= 100;
        System.out.println(array1[1]);
        System.out.println();

        int [] array2 = new int[4]; // создали массив из черех элементов,  но они пока все = 0

        for(int i = 0 ; i < array1.length ; i++){
     //--------1--------------------2---------3---//
      // 1- выполняется только 1 раз
      // 2 - условие - цикл выплняется, пока уловие true
      // 3 - выполняется в конце каждой итерации (теле цикла)

            System.out.println(array1[i]);


        }


    }
}
