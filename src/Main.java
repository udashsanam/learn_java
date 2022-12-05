import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student obj1 = new Student(1 , "second");
        Student obj2 = new Student(2, "third");
        Student ob3 = new Student(0, "first");
        Student ob4 = new Student(454, "fourth");
        Student ob5 = new Student(23, "sana");

        List<Student> students = new ArrayList<>();
        students.add(obj1);
        students.add(obj2);
        students.add(ob3);
        students.add(ob4);
        students.add(ob5);


        for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i).toString());
        }


        System.out.println("-----------------------------");

        for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i).toString());
        }






    }
}