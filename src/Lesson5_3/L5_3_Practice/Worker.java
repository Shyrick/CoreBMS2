package Lesson5_3.L5_3_Practice;

public abstract class Worker {
    public String name;
    public String lastName;

    public Worker(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

//    public String getName() {
//        return name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }

    abstract int selary ();
    public void show(){
        System.out.println(getClass() + "  "+ name + "  " + lastName);
    }
}
