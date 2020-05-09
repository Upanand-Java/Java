package basicPractice;

import java.util.*;

public class MergedtwoArraySortWithoutDup {
    public static void main(String[] args) {
        int[] array1 = {1,3,2,1,4,5,4,4,5,3,22,44,33,4};
        int[] array2 = {1,4,33,223,44,33,4,222,44,2,1,44,5};

        int[] mergedArray = new int[array1.length+array2.length];
        int k = 0;
        for (int i =0;i<=array1.length-1;i++){
            mergedArray[k] = array1[i];
            k++;
        }
        for (int j =0;j<=array2.length-1;j++){
            mergedArray[k] = array2[j];
            k++;
        }
        System.out.println(mergedArray.length);
        for(int l: mergedArray)
        System.out.println(l);

        HashSet<Integer> hashSet = new HashSet();
        for(int m:mergedArray){
            hashSet.add(m);
        }
        System.out.println(hashSet);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(hashSet);
        Collections.sort(integers);
        System.out.println("Sorting through collection !!");
        for(int x:integers){
            System.out.println(x);
        }


        System.out.println("Sorting through arrays: ");
        int[] ints = new int[hashSet.size()];
        int b = 0;
        for(int a: hashSet){
            ints[b] = a;
            b++;
        }
           // Arrays.sort(hashSet.toArray());
        Arrays.sort(ints);
        for(int c:ints){
            System.out.println(c);
        }
    }
}
