package Lesson5_2.L52_practice.Products;

public class IdCeeper {

    public int [] smartfoneIdArray = {0};
    public int [] vegetableIdArray = {0};
    public int [] waterIdArray = {0};

    public IdCeeper() {
        this.smartfoneIdArray = new int[]{0};
        this.vegetableIdArray = new int[]{0};
        this.waterIdArray = new int[]{0};
    }

    public int generateSmartfoneId(){
        int [] array = new int [smartfoneIdArray.length + 1]; // увеличиваем длину массва на 1
        int newId = smartfoneIdArray[smartfoneIdArray.length -1 ] + 1; // увеличиваем на 1 последнее значение в массиве
        for (int i = 0; i < smartfoneIdArray.length ; i++) {
            array [i] = smartfoneIdArray[i];
        }
        array [smartfoneIdArray.length] = newId;
        smartfoneIdArray = array;
        return newId;
    }

    public int generateVegetableId (){
        int [] array = new int [vegetableIdArray.length + 1];
        int newId = vegetableIdArray[vegetableIdArray.length -1 ] + 1; // увеличиваем на 1 последнее значение в массиве
        for (int i = 0; i < vegetableIdArray.length ; i++) {
            array [i] = vegetableIdArray[i];
        }
        array [vegetableIdArray.length] = newId;
        vegetableIdArray = array;
        return newId;
    }

    public int generateWaterId (){
        int [] array = new int [waterIdArray.length + 1];
        int newId = waterIdArray[waterIdArray.length -1 ] + 1; // увеличиваем на 1 последнее значение в массиве
        for (int i = 0; i < waterIdArray.length ; i++) {
            array [i] = waterIdArray[i];
        }
        array [waterIdArray.length] = newId;
        waterIdArray = array;
        return newId;
    }


}
