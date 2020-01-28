package Lesson5_3.L5_3_Practice;

public class FullTimeWorker extends Worker {
    int salery;

    public FullTimeWorker(String name, String lastName, int salery) {
        super(name, lastName);
        this.salery = salery;
    }

    public int getSalery() {
        return salery;
    }

    public String getName(){
        return super.name;
    }

    public String getLastName(){
        return super.lastName;
    }

    @Override
    int selary() {
        return getSalery();
    }

//    public void showFullTimeWorker (){
//        System.out.println(getClass() + "  "+ name + "  " + lastName);
//    }
}
