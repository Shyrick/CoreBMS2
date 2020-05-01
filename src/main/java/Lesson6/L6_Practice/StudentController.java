package Lesson6.L6_Practice;

import java.util.*;

public class StudentController {

    public  void printCollections (Collection collection){
        for (Object element: collection  ) {
            System.out.println(" " + element + " " );
        }
        System.out.println("----------------------");
    }

    public static void printStudents(List<Student> students, int course){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course){
                System.out.println(students.get(i));
            }
        }

    }

    public static Set<Student> union(Set<Student> set1, Set<Student> set2){
        HashSet newSet = new HashSet();
        newSet.addAll(set1);
        newSet.addAll(set2);

//        Или можно так:

//        Iterator<Student> iterator1 = set1.iterator();
//        while (iterator1.hasNext()){
//            Student st = iterator1.next();
//            newSet.add(st);
//        }
//        Iterator<Student> iterator2 = set2.iterator();
//        while (iterator2.hasNext()){
//            Student st = iterator2.next();
//            newSet.add(st);
//        }

        return newSet;
    }

    public static Set<Student> intersect(Set<Student> set1, Set<Student> set2){
        HashSet newSet = new HashSet();
        Iterator<Student> iterator1 = set1.iterator();

        while (iterator1.hasNext()){
            Student st1 = iterator1.next();
            Iterator<Student> iterator2 = set2.iterator();
            while (iterator2.hasNext()){
                Student st2 = iterator2.next();
                if (st1.equals(st2)){
                    newSet.add(st1);
                }

            }
        }
        return newSet;
    }

}
