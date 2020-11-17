package twofourseven;

import java.util.Comparator;
import java.util.TreeMap;

public class Driver {
    public static void main(String[] args) {
        TreeMap<Employee , Employee> emp = new TreeMap<>(Comparator.comparingInt(e1->e1.id));

        emp.put(new Employee(2 , "Jimmy" , 10000) , new Employee(1 , "Jimmy" , 10000));
        emp.put(new Employee(2 , "Upanand" , 10000) , new Employee(2 , "upanand" , 10000));

        System.out.println(emp);
    }
}
