package blumeglobal;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDup {
    public static void main(String[] args) {
        int[] arr = {4,3,2,2,1,6,4,3,7,3};

        remDup(arr);
    }



    private static void remDup(int[] arr){
        HashSet<Integer> integers = new  LinkedHashSet<>();

        for(int i:arr)
            integers.add(i);

        System.out.println(integers);
        List<Integer> list = Arrays.asList();

       Stream.of(arr).distinct().forEach(i-> System.out.println(i));

    }
}
