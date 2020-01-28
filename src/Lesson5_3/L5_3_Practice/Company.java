package Lesson5_3.L5_3_Practice;

import java.io.FileNotFoundException;

public class Company {

    FullTimeWorker [] fullTimeWorkers;
    TimeWorker [] timeWorkers;
    Freelanser [] freelansers;
    Worker [] workers;
    DataReader dataReader;
    DataWriter dataWriter;


    public Company(DataReader dataReader, DataWriter dataWriter) throws FileNotFoundException {
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
        this.fullTimeWorkers = dataReader.readFullTimeWorker();
        this.timeWorkers = dataReader.readTimeWorker();
        this.freelansers = dataReader.readFreelanser();
        this.workers = addAllWorkersInArray();
    }

    public Worker [] addAllWorkersInArray () {
        Worker [] wr = new  Worker[timeWorkers.length + fullTimeWorkers.length + freelansers.length];
        for (int i = 0; i < wr.length ; i++) {
            if (i < fullTimeWorkers.length){
                wr[i] = fullTimeWorkers[i];
            } else if (i >=fullTimeWorkers.length && i < (fullTimeWorkers.length+timeWorkers.length)){
                wr[i] = timeWorkers[i-fullTimeWorkers.length];
            } else wr[i] = freelansers [i - (fullTimeWorkers.length+timeWorkers.length)];
        }
        return wr;
    }

    public double mounsSpends() {
        double mounsSpends = 0;
        for (int i = 0; i < workers.length ; i++) {
            mounsSpends +=  workers [i].selary();
        }
        return mounsSpends;
    }

    public void addNewTimeWorker (String name, String lastName, int workDaysInMouns, int workDayLong, int hoursalery){
        TimeWorker newTimeWorker = new TimeWorker(name, lastName,workDaysInMouns, workDayLong, hoursalery);
        TimeWorker [] newTimeWorkers = new TimeWorker[timeWorkers.length + 1];
        for (int i = 0; i < timeWorkers.length ; i++) {
            newTimeWorkers [i] = timeWorkers[i];
        }
        newTimeWorkers [newTimeWorkers.length-1] = newTimeWorker;
        timeWorkers = newTimeWorkers;
        dataWriter.writeTimeWorkers(timeWorkers);
    }

    public void addNewFullTimeWorker (String name, String lastName, int salery){
        FullTimeWorker newFullTimeWorker = new FullTimeWorker(name, lastName, salery);
        FullTimeWorker [] newFullTimeWorkers = new FullTimeWorker[fullTimeWorkers.length + 1];
        for (int i = 0; i < fullTimeWorkers.length ; i++) {
            newFullTimeWorkers [i] = fullTimeWorkers[i];
        }
        newFullTimeWorkers [newFullTimeWorkers.length-1] = newFullTimeWorker;
        fullTimeWorkers = newFullTimeWorkers;
        dataWriter.writeFullTimeWorkers(fullTimeWorkers);
    }

    public void addNewFrelanser (String name, String lastName, int workHours, int hoursalery){
        Freelanser newFrelanser = new Freelanser(name, lastName,workHours, hoursalery);
        Freelanser [] newFrelansers = new Freelanser[freelansers.length + 1];
        for (int i = 0; i < freelansers.length ; i++) {
            newFrelansers [i] = freelansers[i];
        }
        newFrelansers [newFrelansers.length-1] = newFrelanser;
        freelansers = newFrelansers;
        dataWriter.writeFrelansers(freelansers);
    }

    public void showWorkers (){
        for (int i = 0; i < workers.length ; i++) {
            System.out.println(workers[i].getClass() + " "+ workers[i].name + "  " + workers[i].lastName);
        }
        System.out.println("---------------");
    }

}
