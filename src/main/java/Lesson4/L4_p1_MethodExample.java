package Lesson4;

public class L4_p1_MethodExample {

    // Метод, который печатает слово Hello
   public static void printHello (){
        System.out.println("Hello");
    }

// Метод для вывода любого массива в консоль в одну строку
    public static void printArray (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i] + " ");
        }
        System.out.println();
        //Внутри метода можно вызывать другой метод
        printHello();
    }

    // Метод, который переводит массив в строку
    public static String arrayToString (int [] arr){
        String result = "";
        for (int i = 0; i <arr.length ; i++) {
            result += arr [i] + " ";
        }
        return result;
    }
    // Перегрузка метода - назавание тоже, но метод принимает другие аргументы
    public static String arrayToString (int [] arr, int count){
    // На случай, если введут count < 0, можно бросить ошибку:
        if (count < 0 )throw new IllegalArgumentException("count < 0 !!!");
        String result = "";
        for (int i = 0; i <arr.length && i < count ; i++) {
            result += arr [i] + " ";
        }
        return result;
    }
// Другой вариант перегрузки метода, когда один метод вызывает внутри себя одноименный метод,
// но с другими параметрами (при разкоментировании нужно переменовать метод)

     //  public static String arrayToString (int [] arr){
     //     return arrayToString(arr, arr.length);
     //  }

    public static void main(String[] args) {

        int[] array = {1, 3, 7, 15, 6, 100};
        int[] array2 = {1, 43, 72, 1, 64, 105};
        printArray( array);
        System.out.println(arrayToString(array2));

        System.out.println( arrayToString(array, -1));

        // Код для вывода маасива array в консоль в одну строку
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array [i] + " ");
//        }

        // Код для вывода маасива array2 в консоль в одну строку
//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2 [i] + " ");
//        }
    }
}
