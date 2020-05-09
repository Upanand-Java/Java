package basicPractice;

import java.util.HashMap;

final class HashMapPractice {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(null,null);
        hashMap.put(1,null);
        hashMap.put("null",null);
        hashMap.put(2,null);
        for(Object o:hashMap.keySet()){
            System.out.println(o+" : "+hashMap.get(o));
            //System.out.println(hashMap.get(o));

        }
    }
}
