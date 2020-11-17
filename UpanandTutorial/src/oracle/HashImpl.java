package oracle;

import java.util.HashMap;

public class HashImpl {
    public static void main(String[] args) {
        HashMap<Employee , Integer> hashMap = new HashMap<>();
        Employee e1 = new Employee(1,"upanand");
        Employee e2 = new Employee(1,"upanand");
        hashMap.put(e1,1);
        hashMap.put(e2,2);
        System.out.println(hashMap);
        System.out.println(hashMap.get(e1));
        System.out.println(hashMap.get(e2));
    }
}
