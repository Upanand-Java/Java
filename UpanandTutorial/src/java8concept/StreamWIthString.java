package java8concept;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class EmployeeNew{
    int empId;
    String name;

    public EmployeeNew(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeNew{" +
                "empId=" + empId +
                ", name=" + name +
                '}';
    }
}

public class StreamWIthString {
    public static void main(String[] args) {
        HashSet<EmployeeNew> hashMap = new HashSet<>();
        hashMap.add(new EmployeeNew(1,"hey"));
        hashMap.add(new EmployeeNew(2,"he"));
        hashMap.add(new EmployeeNew(1,"he"));

       // hashMap.stream().sorted((o1, o2) -> -o1.name.compareTo(o2.name)).forEach(it-> System.out.println(it));
        hashMap.stream().sorted(Comparator.comparing((EmployeeNew e1 )-> e1.name).
                thenComparing((EmployeeNew e ) ->e.empId)).forEach(i-> System.out.println(i));

       // System.out.println(hashMap);
       long o = hashMap.stream().filter(i-> i.empId>0).count();
        System.out.println(o);


    }
}
