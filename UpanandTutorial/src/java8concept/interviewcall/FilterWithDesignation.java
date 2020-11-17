package java8concept.interviewcall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterWithDesignation {
    public static void main(String[] args) {
        List<EmployeeClass> employeeClasses = new ArrayList<>();
        employeeClasses.add(new EmployeeClass("Upanand" , "SSE"));
        employeeClasses.add(new EmployeeClass("Verma" , "TL"));
        employeeClasses.add(new EmployeeClass("Verma" , "TL"));
        employeeClasses.add(new EmployeeClass("Warren" , "Manager"));
        employeeClasses.add(new EmployeeClass("buffet" , "Manager"));

        Predicate<EmployeeClass> classPredicate = (e1)->{
            if(e1.getDesignation().equalsIgnoreCase("Manager"))
                return true;
            else
                return false;
        };

        employeeClasses.stream().filter(classPredicate).forEach(i-> System.out.println(i));

       List<EmployeeClass> emp = employeeClasses.stream().filter(i-> i.getDesignation().equalsIgnoreCase("Manager")).collect(Collectors.toList());

       List<String> ls = employeeClasses.stream().filter(i-> i.getDesignation().equalsIgnoreCase("Manager"
        )).map(EmployeeClass::getName).collect(Collectors.toList());
        System.out.println(ls);

        int counter = (int)employeeClasses.stream().filter(i-> !i.getDesignation().equalsIgnoreCase("Manager")).count();
        System.out.println("count of employee "+counter);

        Map<String ,List<EmployeeClass>> map = employeeClasses.stream().collect(Collectors.groupingBy(i-> i.getName()));
        System.out.println(map);






        Map<EmployeeClass , Integer> integerMap = new HashMap<>();
        integerMap.put(new EmployeeClass("Upanand" , "SSE") ,1);
        integerMap.put(new EmployeeClass("Upanand" , "SSE") ,1);
        integerMap.put(new EmployeeClass("Upanand" , "SSE") ,1);

        System.out.println(integerMap.size());

        ArrayList objects = new ArrayList();
        objects.add(null);
        objects.add(null);
        objects.add(null);
        System.out.println(objects.size());


        

    }
}
