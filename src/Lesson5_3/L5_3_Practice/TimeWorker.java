package Lesson5_3.L5_3_Practice;

public class TimeWorker extends Worker {

    int workDaysInMouns;
    int workDayLong;
    int hoursalery;

    public TimeWorker(String name, String lastName, int workDaysInMouns, int workDayLong, int hoursalery) {
        super(name, lastName);
        this.workDaysInMouns = workDaysInMouns;
        this.workDayLong = workDayLong;
        this.hoursalery = hoursalery;
    }

//    public void showTimeWorker (){
//        System.out.println(getClass() + "  "+ name + "  " + lastName);
//    }
    @Override
    int selary() {
        return workDaysInMouns*workDayLong*hoursalery;
    }

    public int getWorkDaysInMouns() {
        return workDaysInMouns;
    }

    public int getWorkDayLong() {
        return workDayLong;
    }

    public int getHoursalery() {
        return hoursalery;
    }
    public String getName(){
        return super.name;
    }
    public String getLastName(){
        return super.lastName;
    }

}
