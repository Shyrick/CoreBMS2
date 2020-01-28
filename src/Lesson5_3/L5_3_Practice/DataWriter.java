package Lesson5_3.L5_3_Practice;

import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {
    String pathToTimeWorkers;
    String pathToFullTimeWorkers;
    String pathToFrelansers;
//    Company company;



    public DataWriter() {
        this.pathToTimeWorkers = "files/Lesson5_3/L5_3_practice/TimeWorkers.txt";
        this.pathToFullTimeWorkers = "files/Lesson5_3/L5_3_practice/FullTimeWorkers.txt";
        this.pathToFrelansers = "files/Lesson5_3/L5_3_practice/Frelanser.txt";
    }

    public void writeTimeWorkers (TimeWorker [] timeWorkers) {
        try {
            FileWriter timeWorkersWriter = new FileWriter(pathToTimeWorkers);

            for (int i = 0; i < timeWorkers.length; i++) {
                timeWorkersWriter.write(timeWorkers[i].getName() + " ");
                timeWorkersWriter.write(timeWorkers[i].getLastName() + " ");
                timeWorkersWriter.write(timeWorkers[i].getWorkDaysInMouns() + " ");
                timeWorkersWriter.write(timeWorkers[i].getWorkDayLong() + " ");
                timeWorkersWriter.write(timeWorkers[i].getHoursalery() + "\n");
            }
            timeWorkersWriter.flush();
            timeWorkersWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeFullTimeWorkers (FullTimeWorker [] fullTimeWorkers) {
        try {
            FileWriter fullTimeWorkersWriter = new FileWriter(pathToFullTimeWorkers);

            for (int i = 0; i < fullTimeWorkers.length; i++) {
                fullTimeWorkersWriter.write(fullTimeWorkers[i].getName() + " ");
                fullTimeWorkersWriter.write(fullTimeWorkers[i].getLastName() + " ");
                fullTimeWorkersWriter.write(fullTimeWorkers[i].getSalery() + "\n");
            }
            fullTimeWorkersWriter.flush();
            fullTimeWorkersWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeFrelansers (Freelanser [] freelansers) {
        try {
        FileWriter frelansersWriter = new FileWriter(pathToFrelansers);

            for (int i = 0; i <freelansers.length ; i++) {
                frelansersWriter.write(freelansers[i].getName() + " ");
                frelansersWriter.write(freelansers[i].getLastName() + " ");
                frelansersWriter.write(freelansers[i].getWorkHours() + " ");
                frelansersWriter.write(freelansers[i].getHourSalary() + "\n");
            }
            frelansersWriter.flush();
            frelansersWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
