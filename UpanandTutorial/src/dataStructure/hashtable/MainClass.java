package dataStructure.hashtable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Map<String,Integer> integerMap = new HashMap<>();
        integerMap.put("a",3);
        Collections.unmodifiableMap(integerMap);
        integerMap.put("v",5);
        System.out.println(integerMap);
        integerMap.remove("a");
        System.out.println(integerMap);
    }
}
