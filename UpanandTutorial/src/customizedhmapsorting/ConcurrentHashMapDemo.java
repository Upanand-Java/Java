package customizedhmapsorting;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.putIfAbsent("upanand",1);
        map.putIfAbsent("upanand",3);

        map.put("virat" ,1);
        map.put("virat",3);

        for(String a: map.keySet()){

            System.out.println(map.get(a));
            map.put("fefe",2);
        }

        System.out.println(map);

        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.putIfAbsent("upanand",1);
        hmap.putIfAbsent("upanand",3);



        hmap.put("virat" ,1);
        hmap.put("virat",3);

        for(String a: hmap.keySet()){

            System.out.println(hmap.get(a));
            hmap.put("fefe",2);
        }

        System.out.println(hmap);




    }
}
