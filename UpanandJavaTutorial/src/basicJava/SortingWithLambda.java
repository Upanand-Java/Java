package basicJava;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(32);
        al.add(43);
        al.add(79);

        Collections.sort(al , (i1, i2)->(i1>i2)?-1:(i1<i2)?1:0); // Lamda expression is replaced from the object of comparator interface !!
        System.out.println("Descending order of list is "+al);

    }
}
