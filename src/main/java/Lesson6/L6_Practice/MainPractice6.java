package Lesson6.L6_Practice;

import java.util.*;

public class MainPractice6 {





    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add( new Student("N1", 3));
        arrayList.add( new Student("N2", 1));
        arrayList.add( new Student("N3", 2));
        arrayList.add(  new Student("N4", 1));

        HashSet hashSet1 = new HashSet(arrayList);
        HashSet hashSet2 = new HashSet();
        hashSet2.add( new Student("N1", 3));
        hashSet2.add( new Student("N2", 1));
        hashSet2.add( new Student("N7", 1));

        StudentController studentController = new StudentController();
       // studentController.printStudents( arrayList, 3);
//        studentController.printCollections(hashSet1);
//        studentController.printCollections(hashSet2);
//        studentController.printCollections(studentController.union(hashSet1, hashSet2));
        studentController.printCollections(studentController.intersect(hashSet1, hashSet2));
    }
}
