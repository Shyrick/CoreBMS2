package Lesson5_3.L5_3_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReader {
    String pathToTimeWorkers;
    String pathToFullTimeWorkers;
    String pathToFrelanser;

    public DataReader() {
        this.pathToTimeWorkers = "files/Lesson5_3/L5_3_practice/TimeWorkers.txt";
        this.pathToFullTimeWorkers = "files/Lesson5_3/L5_3_practice/FullTimeWorkers.txt";
        this.pathToFrelanser = "files/Lesson5_3/L5_3_practice/Frelanser.txt";
    }

    public int readStringNumberInFile(String path) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);
        int length = 0;
        while (scanner.hasNext())
        {
            scanner.nextLine();
            length ++;
        }
        scanner.close();
//        System.out.println(length);
        return length;
    }

    public TimeWorker [] readTimeWorker () throws FileNotFoundException {
        int length = readStringNumberInFile(pathToTimeWorkers);
        TimeWorker [] timeWorkers = new TimeWorker[length];

        FileInputStream stream = new FileInputStream(pathToTimeWorkers);
        Scanner scanner = new Scanner(stream);
        for (int i = 0; i < timeWorkers.length ; i++) {
            String name = scanner.next();
            String lastName = scanner.next();
            int workDaysInMouns = scanner.nextInt();
            int workDayLong = scanner.nextInt();
            int hoursalery = scanner.nextInt();

            TimeWorker timeWorker = new TimeWorker(name, lastName, workDaysInMouns, workDayLong, hoursalery );
            timeWorkers [i] = timeWorker;
        }
        scanner.close();
        return timeWorkers;
    }

    public FullTimeWorker [] readFullTimeWorker () throws FileNotFoundException {
        int length = readStringNumberInFile(pathToFullTimeWorkers);
        FullTimeWorker [] fullTimeWorkers = new FullTimeWorker[length];

        FileInputStream stream = new FileInputStream(pathToFullTimeWorkers);
        Scanner scanner = new Scanner(stream);
        for (int i = 0; i < fullTimeWorkers.length ; i++) {
            String name = scanner.next();
            String lastName = scanner.next();
            int salery = scanner.nextInt();

            FullTimeWorker fullTimeWorker = new FullTimeWorker(name, lastName, salery );
            fullTimeWorkers [i] = fullTimeWorker;
        }
        scanner.close();
        return fullTimeWorkers;
    }

    public Freelanser [] readFreelanser () throws FileNotFoundException {
        int length = readStringNumberInFile(pathToFrelanser);
        Freelanser [] freelansers = new Freelanser [length];

        FileInputStream stream = new FileInputStream(pathToFrelanser);
        Scanner scanner = new Scanner(stream);
        for (int i = 0; i < freelansers.length ; i++) {
            String name = scanner.next();
            String lastName = scanner.next();
            int workHours = scanner.nextInt();
            int hoursalery = scanner.nextInt();

            Freelanser freelanser = new Freelanser (name, lastName, workHours, hoursalery);
            freelansers [i] = freelanser;
        }
        scanner.close();
        return freelansers;
    }

}
