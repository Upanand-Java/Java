package basicJava.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasicDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(10);
        integers.add(2);
        integers.add(25);
        //can you plesea list out all the element which is even number in a list
        System.out.println(integers);
        //until 1.7
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i:integers){
            if(i%2==0 && i!=0){
                list.add(i);
            }
        }
        System.out.println("Even number list is "+list);
        //In 1.8 with stream concept !!
        Predicate<Integer> integerPredicate = (p)-> p%2==0 &&p!=0;
        List<Integer> list1 = integers.stream().filter(integerPredicate).collect(Collectors.toList());
        System.out.println("Even number using stream "+list1);

        //Now my requirement is to do some operation on collection object
        //I want to double the each value in the list
        //in 1.7
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int j:integers){
            integerArrayList.add(2*j);
        }
        System.out.println("Double operation with 1.7 "+integerArrayList);
        //1.8
        Function<Integer,Integer> integerIntegerFunction = i-> 2*i;
        List<Integer> list2 = integers.stream().map(integerIntegerFunction).collect(Collectors.toList());
        long count = integers.stream().map(integerIntegerFunction).count();
        List<Integer> integers1 = integers.stream().sorted().collect(Collectors.toList());
        List<Integer> list3 = integers.stream().sorted((i1,i2)->(i1>i2)?-1:(i2>i1)?1:0).collect(Collectors.toList());
        List<Integer> list4 = integers.stream().sorted((i1,i2)->-(i1.compareTo(i2))).collect(Collectors.toList());
        int minValue = integers.stream().min((i1,i2)->i1.compareTo(i2)).get();
        int maxValue = integers.stream().max((i1,i2)->i1.compareTo(i2)).get();

        System.out.println("Count of element "+count);
        System.out.println("Double operation with 1.8 "+list2);
        System.out.println("Default sorting order is: "+integers1);
        System.out.println("customized sorting order: "+list3);
        System.out.println("customized with compareTO "+list4);
        System.out.println("Min value is "+minValue);
        System.out.println("Max value is "+maxValue);

    }
}
