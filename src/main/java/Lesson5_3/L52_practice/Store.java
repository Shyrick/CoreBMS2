package Lesson5_3.L52_practice;

import Lesson5_3.L52_practice.Products.*;

public class Store {

    public int money;
    Smartfone[] smartfones;
    Vegetable[] vegetables;
    Water[] waters;
    String [] products;
    Product curentProduct;
    ProductWriter writer;

    public Store(int money, Smartfone[] smartfones, Vegetable[] vegetables, Water[] waters) {
        this.money = money;
        this.smartfones = smartfones;
        this.vegetables = vegetables;
        this.waters = waters;
        this.products = new String[]{"Smartfone", "Vegetables", "Water" };
        this.curentProduct = null;
        writer = new ProductWriter();
    }

    public Product getCurentProduct() {
        return curentProduct;
    }

    public void addSmartfoneToArray (Smartfone newSmartfone){
        Smartfone[] newArray = new Smartfone[smartfones.length + 1];
        for (int i = 0; i < smartfones.length ; i++) {
            newArray [i] = smartfones [i];
        }
        newArray[newArray.length-1] = newSmartfone;
        smartfones = newArray;
       writer.writeSmartfonesToFile(smartfones);

    }

    public void addVegetableToArray (Vegetable newVegetable){
        Vegetable[] newArray = new Vegetable[vegetables.length + 1];
        for (int i = 0; i < vegetables.length ; i++) {
            newArray [i] = vegetables [i];
        }
        newArray[newArray.length-1] = newVegetable;
        vegetables = newArray;
        writer.writeVegetableToFile(vegetables);
    }

    public void addWaterToArray (Water newWater){
        Water[] newArray = new Water[waters.length + 1];
        for (int i = 0; i < waters.length ; i++) {
            newArray [i] = waters [i];
        }
        newArray[newArray.length-1] = newWater;
        waters = newArray;
        writer.writeWaterToFile(waters);
    }

    public Product findProductById (Product[] products, int id){
//        Если введенного Id нет, то выводит первый товар в массиве

        for (int i = 0; i < products.length; i++) {
            if (products [i].getId() == id){
                return products[i];
            }
        }return products [0];
    }

    public void buyCurrentProduct (Product[] products, Product curentProduct){
//В массиве товаров уменьшаем колличестов у текущего товара на 1
        // и сумму в магазине нужно увеличить на стоимость товара(это не делал)
        findProductById(products, curentProduct.getId()).amount --;
    }

    public Product[] findCategoryArray(String category){
        if (category == "Smartfone" ) {
            return smartfones;
        } else if (category == "Vegetables") {
            return vegetables;
        } else return waters;

    }

    public void showCategoryArray (Product[] array){
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i].show(); //вместо вывода в консоль сделать вывод в окно
        }
    }

    public Smartfone[] getSmartfones() {
        return smartfones;
    }

    public Vegetable[] getVegetables() {
        return vegetables;
    }

    public Water[] getWaters() {
        return waters;
    }
}
