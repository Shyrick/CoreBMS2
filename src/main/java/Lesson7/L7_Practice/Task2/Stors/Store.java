package Lesson7.L7_Practice.Task2.Stors;

import Lesson7.L7_Practice.Task2.Products.Product;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Store <T>{
    public String name;
    public String address;
    public ArrayList <T> products;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;

    }


    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", products=" + products +
                '}';
    }
}
