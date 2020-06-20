package missiondsa180Ques.array;

import java.util.LinkedList;
import java.util.List;

public class PascalTraingal {
    public static void main(String[] args) {

        int x = 20;
        List<List<Integer>> l = generate(x);
        System.out.println(l);

    }

    private static List<List<Integer>> generate(int x) {
        List<List<Integer>>  outerList = new LinkedList<>();

        List<Integer> innerList = new LinkedList<>();
        innerList.add(1);
        outerList.add(innerList);


        for(int i =1;i<=x;i++){
            List<Integer> list = new LinkedList<>();
            list.add(1);

            List<Integer> p = outerList.get(i-1);

            for(int j = 0;j<p.size()-1;j++){
                list.add(p.get(j) + p.get(j+1));
            }

            list.add(1);
            outerList.add(list);

        }









       // throw new RuntimeException("not valid");
        return outerList;

    }
}
