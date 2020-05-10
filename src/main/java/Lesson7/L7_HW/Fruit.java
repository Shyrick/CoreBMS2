package Lesson7.L7_HW;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Fruit {
    private FruitType fruitType;
    private int shelfLife;

//    @JSONField(format="dd/MM/yyyy")
//    public Date dateOfDelivery;
    // т.к. не получилось из json вытянуть дату, тип Data я заменил на месяц поставки с типом int
    private int deliveryMonth;
    private int price;

    public Fruit(FruitType fruitType, int shelfLife, int deliveryMonth, int price) {
        this.fruitType = fruitType;
        this.shelfLife = shelfLife;
        this.deliveryMonth = deliveryMonth;
        this.price = price;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public int getDeliveryMonth() {
        return deliveryMonth;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitType=" + fruitType +
                ", shelfLife=" + shelfLife +
                ", deliveryMonth=" + deliveryMonth +
                ", price=" + price +
                '}';
    }
}
