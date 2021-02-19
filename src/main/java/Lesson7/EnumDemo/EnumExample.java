package Lesson7.EnumDemo;

public class EnumExample {

    public static void printType (DogType type){
        if (type == DogType.Dolmatian){
            System.out.println(" Type is Dolmatian" );
        }
        if (type == DogType.Kokker){
            System.out.println(" Type is Kokker" );
        }
        if (type == DogType.Bobik){
            System.out.println(" Type is Bobik" );
        }
        if (type == DogType.Sharick){
            System.out.println(" Type is Sharick" );
        }
    }
    public static void main(String[] args) {

        DogType dogType = DogType.Dolmatian;
        printType(dogType);
        printType(DogType.Bobik);





    }
}
