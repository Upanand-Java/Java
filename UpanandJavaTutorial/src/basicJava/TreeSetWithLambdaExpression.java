package basicJava;

import java.util.TreeSet;

public class TreeSetWithLambdaExpression {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        //TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(123);
        treeSet.add(33);
        treeSet.add(234);
        treeSet.add(432);
        System.out.println("Descending order is "+treeSet);
    }
}
