package Lesson7.L7_HW;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Fruit {
    public FruitType fruitType;
    public Integer shelfLife;

    @JSONField(format="dd/MM/yyyy")
    public Date dateOfDelivery;
    public Integer price;

    public Fruit(FruitType fruitType, int shelfLife, Date dateOfDelivery, Integer price) {
        this.fruitType = fruitType;
        this.shelfLife = shelfLife;
        this.dateOfDelivery = dateOfDelivery;
        this.price = price;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public int getShelf_life() {
        return shelfLife;
    }

//    public Date getDateOfDelivery() {
//        return dateOfDelivery;
//    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitType=" + fruitType +
                ", shelfLife=" + shelfLife +
                ", price=" + price +
                '}';
    }
}
