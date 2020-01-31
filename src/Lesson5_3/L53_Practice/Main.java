package Lesson5_3.L53_Practice;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        DataReader dataReader = new DataReader();
        DataWriter dataWriter = new DataWriter();
        Company company = new Company(dataReader, dataWriter);

        company.showWorkers();
        company.addNewTimeWorker("N4", "LN4",12, 8, 5);
       company.addNewFullTimeWorker("N4", "LN4", 1355);
       company.addNewFrelanser("N5", "LN5", 15, 3);

//        dataReader.readTimeWorker();
//        dataReader.readFullTimeWorker();


    }
}
