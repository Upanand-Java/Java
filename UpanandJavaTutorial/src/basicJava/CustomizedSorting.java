package basicJava;

import java.util.ArrayList;
import java.util.Collections;

import basicJava.Employee;

public class CustomizedSorting {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(10,"upanand"));
        emp.add(new Employee(1,"virat"));
        emp.add(new Employee(22,"kohli"));
        emp.add(new Employee(24,"sunny"));

        System.out.println(emp);
        Collections.sort(emp , (e1,e2)->(e1.eno>e2.eno)?1:(e1.eno<e2.eno)?-1:0); // sort if we want ascending order of empId
        //Collections.sort(emp , (e1,e2)-> (e1.ename>e2.ename)?-1:(e1.ename<e2.ename)?1:0);
        System.out.println(emp);

    }

}
