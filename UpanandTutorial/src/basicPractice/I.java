package basicPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface I {
    String name = "upanand";
}

class A implements I{
    public static void main(String[] args) {
        System.out.println(I.name);
        A a = new A();
        String name ="hey";
        System.out.println(a.name);
        HashMap<Integer , String> map = new HashMap<>();
        map.put(1,"string");
       Map m = Collections.synchronizedMap(map);
        System.out.println(m);

    }
}
