package Lesson5_3.L52_practice.Products;

import Lesson5_3.L52_practice.Store;

public class IdCeeper {

    Store store;

    public IdCeeper(Store store) {
        this.store = store;
    }

    public int generateSmartfoneId(){
        Smartfone [] smartfones = store.getSmartfones();
        int newId = smartfones[smartfones.length -1].getId() + 1; // увеличиваем на 1 последнее значение в массиве
        return newId;
    }

    public int generateVegetableId (){
        Vegetable[] vegetables = store.getVegetables();
        int newId = vegetables[vegetables.length -1].getId() + 1;
        return newId;
    }

    public int generateWaterId (){
        Water[] waters = store.getWaters();
        int newId = waters[waters.length -1].getId() + 1;
        return newId;
    }


}
