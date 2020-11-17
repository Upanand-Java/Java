package basicPractice;

import oracle.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class JavaEight {
    public static void main(String[] args) {
        Map<Integer , String> map  = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++)
            list.add(i);

         list.stream().filter(i-> i%2==0).map(i-> map.put(i,"even")).collect(Collectors.toList());
       // List<Integer> a = list.stream().filter(i-> i%2==0).map(i-> i+1).collect(Collectors.toList());
        System.out.println(list);
        list.stream().filter(i-> i%2!=0).map(i-> map.put(i,"odd")).collect(Collectors.toList());

        System.out.println(map);

      List<Integer> a =  list.stream().sorted().collect(Collectors.toList());

        for(Object i:a)
          System.out.print(i);

        List<Employee> ls = new ArrayList<>();
        ls.add(new Employee(1,"upanand"));
        ls.add(new Employee(3,"virat"));
        ls.add(new Employee(2,"kohli"));

        /*List<Employee> employees = ls.stream().sorted((e1,e2)->(e1.id > e2.id)
                    ?1:(e2.id>e1.id)?-1:0).collect(Collectors.toList());*/
        List<Employee> employees = ls.stream().sorted(Comparator.comparing(e1->e1.id))
                .collect(Collectors.toList());
        System.out.println(employees);

        List<Employee> employees1 = ls.stream().sorted(Comparator.comparing(e1->e1.name))
                .collect(Collectors.toList());

        System.out.println(employees1);

    }


}
