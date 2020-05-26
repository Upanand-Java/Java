package dataStructure.hashtable;

import java.util.*;

public class CountPrimes {
    public static void main(String[] args) {
        int x = 49;
        int a = primeNum(x);
        System.out.println("FInal ANswer is "+a);
    }

    private static int primeNum(int x) {

        HashMap<Integer,Integer> nprimeHashMap = new HashMap<>(x);

        if(x <= 1)
            throw new IllegalArgumentException("Input is not valid !!");
        int l = 0;

        int m =2;
          while(m != x+1){
              int a = 0;
            for (int i = 2; i <= x; i++) {

                if(m% i == 0){
                    nprimeHashMap.put(m,a++);
                   // l++;

                }
            }
            m++;

        }
        System.out.println(nprimeHashMap);

       // HashSet<Integer> integers = new HashSet<>();
       // integers.contains()



          /*for(Map.Entry<Integer,Integer> integerEntry: nprimeHashMap.entrySet()){
              if(integerEntry.getValue() == 0){
                 l++;
              }
          }*/

          return l;






       // throw new IllegalArgumentException("Input is not valid !return 0;
    }
}
