package customizedhmapsorting;

import java.util.*;

public class DriverClass {
    public static void main(String[] args) {

        HashMap<Integer, Student> integerStudentHashMap = new HashMap<Integer, Student>();
        integerStudentHashMap.put(1,new Student("upanand",33,321));
        integerStudentHashMap.put(2,new Student("virat",12,335));
        integerStudentHashMap.put(3,new Student("kohli",13,349));

        ArrayList<Student> students = new ArrayList<>();
        students.addAll(integerStudentHashMap.values());

        Collections.sort(students, Comparator.comparingInt(e->-e.id));
        LinkedHashMap<Integer , Student> integerStudentLinkedHashMap = new LinkedHashMap<>();
        int index = 1;
        for (Student studentArrayList: students){
            integerStudentLinkedHashMap.put(index,studentArrayList);
            index++;

        }
        System.out.println(integerStudentLinkedHashMap);
    }

}
