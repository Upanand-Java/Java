package basicJava;

import java.util.TreeMap;

public class TreeMapCustomizedSortingWithLambda {
    public static void main(String[] args) {
      //  TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>(); // Default sorting
        TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>((i1,i2)->(i1>i2)?-1:(i2>i1)?1:0); // customized sorting with Lamda expression!!
        treeMap.put(21,"upanand");
        treeMap.put(32,"Durga");
        treeMap.put(1,"Virat");
        treeMap.put(3,"kohli");
        System.out.println(treeMap);
    }
}
