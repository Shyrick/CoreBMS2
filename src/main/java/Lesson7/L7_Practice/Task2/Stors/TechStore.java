package Lesson7.L7_Practice.Task2.Stors;




import Lesson7.L7_Practice.Task2.Products.TechProduct;

import java.util.ArrayList;

public class TechStore extends Store{

    public ArrayList <TechProduct> products;

    public TechStore(String name, String address, ArrayList<TechProduct> products) {
        super(name, address);
        this.products = products;
    }

    @Override
    public String toString() {
        return "TechStore{" +
                "products=" + products +
                "} " + super.toString();
    }
}
