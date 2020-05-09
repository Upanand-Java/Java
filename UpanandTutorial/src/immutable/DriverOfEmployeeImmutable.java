package immutable;

import java.util.ArrayList;
import java.util.List;

public class DriverOfEmployeeImmutable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("p1");
        ImmutableEmployeeClass immutableEmployeeClass = new ImmutableEmployeeClass(1,"upanand",list);
        System.out.println("Before Modification");
        System.out.println(immutableEmployeeClass);
        list.add("p2");
        System.out.println("After modification");
        System.out.println(immutableEmployeeClass);


    }
}
