package Lesson7.L7_HW;

import com.alibaba.fastjson.JSON;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Company {

    private String pathToCompanyStorage;
    public ArrayList<Store> stores;

    public Company(String pathToCompanyStorage, ArrayList<Store> stores) {
        this.pathToCompanyStorage = pathToCompanyStorage;
        this.stores = stores;
    }

    public Company(ArrayList<Store> stores) {
        this.stores = stores;
    }

    public void save() throws IOException {
        FileWriter writer = new FileWriter(pathToCompanyStorage,  false);
        Company company = new Company(this.stores);
        String json = JSON.toJSONString(company, true);
        writer.write(json);
        writer.flush();
        writer.close();
    }

    ArrayList<Fruit> getSpoiledFruits(int date){
        ArrayList <Fruit> spoiledFruit =  new ArrayList<>();
        for (int i = 0; i < stores.size(); i++) {
            for (int j = 0; j < stores.get(i).fruits.size() ; j++) {
                if ((stores.get(i).fruits.get(j).getDeliveryMonth()+stores.get(i).fruits.get(j).getShelfLife())< date){
                    spoiledFruit.add(stores.get(i).fruits.get(j));
                }
            }

        }
        return spoiledFruit;
    }
}
