package javacursor;

import java.util.ArrayList;
import java.util.Collections;

public class ImplementComparable {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(22,540,"upanand"));
        students.add(new Student(29,530,"virat"));
        students.add(new Student(20,499,"kohli"));
        Collections.sort(students);

        for(Student std:students){
            System.out.println(std.name);
        }
    }
}
