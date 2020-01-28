package Lesson5_3.L5_3_Practice;

public class Freelanser extends Worker {
    int workHours;
    int hourSalary;

    public Freelanser(String name, String lastName, int workHours, int hourSalary) {
        super(name, lastName);
        this.workHours = workHours;
        this.hourSalary = hourSalary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHourSalary() {
        return hourSalary;
    }

    public String getName(){
        return super.name;
    }
    public String getLastName(){
        return super.lastName;
    }

    @Override
    int selary() {
        return workHours*hourSalary;
    }
}
