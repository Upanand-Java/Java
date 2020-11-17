package basicPractice;

import java.util.Comparator;
import java.util.TreeMap;

public class ManhattanAssociate {
    public static void main(String[] args) {
        int[] arr = {13,11,10,-1,-1,46,3,11,46};
            getRes(arr);

            final String abc;

            abc = "upanand";
        System.out.println(abc);

        final ManhattanAssociate obj = new ManhattanAssociate();

        //String input = "(a+b((+c)))((";
        // (a+b)*c*(a+d)

        //ROllno name marks sub_Name
        // 1       A    10      Maths
        //1        A    20     science
        // 2       b    30      Maths
        //2       b     40     science
        // 3       c    50      Maths
        //3       c     60     science
        // 4       d    70      Maths
        //4       d     80     science

        //write a query to find max marks of each student
        // select name, max_marks from student where max_marks in
    }

    private static void getRes(int[] arr) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>(Comparator.comparingInt(i->-i));
        for(int i:arr)
            treeMap.put(i,treeMap.getOrDefault(i,0)+1);
        System.out.println(treeMap);


    }
}
