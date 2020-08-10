package javacursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasedOnTwoField {

    Comparator<Employee> comparator = (o1,o2)->{
       if(o1.name.compareTo(o2.name) > 0){
           return 1;

        }else if(o1.name.compareTo(o2.name) < 0){
           return -1;
       }else {
           return o1.dept.compareTo(o2.dept);
       }

    };

    Comparator<Employee> getComparator = Comparator.comparing((Employee e1) ->e1.name).
            thenComparing((Employee e2)->e2.dept);




    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"upanand","gT"));
        employees.add(new Employee(2,"afgh","zbc"));
        employees.add(new Employee(3,"kishan","finance"));
        employees.add(new Employee(3,"kishan","tinance"));

        //Collections.sort(employees,new BasedOnTwoField().comparator);
        Collections.sort(employees,new BasedOnTwoField().getComparator);

        System.out.println(employees);

    }
}
