package synechron;

import java.util.*;

public class MapAndSortString {
    public static void main(String[] args) {


        Student student = new Student("upanand",560068);
        Student student1 = new Student("virat",600566);
        Student student2 = new Student("Rahul" , 345666);

        LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<>();
        hashMap.put(student.name,student.getZipcode());
        hashMap.put(student1.name , student1.getZipcode());
        hashMap.put(student2.name , student2.getZipcode());

        System.out.println(hashMap);
        Set<Map.Entry<String,Integer>> entries = hashMap.entrySet();
        List<Map.Entry<String,Integer>> entries1 = new ArrayList<>(entries);
        Collections.sort(entries1,Comparator.comparingInt(e->e.getValue()));

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(entries1.size());

        for(Map.Entry<String,Integer> entry:entries1){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println("After sorting");
        System.out.println(linkedHashMap);
        for(Map.Entry<String,Integer> result: linkedHashMap.entrySet()){
            System.out.println(result.getKey()+" : "+result.getValue());
        }
    }

}
