package missiondsa180Ques.array;

import java.util.LinkedList;
import java.util.List;

/**
 * here range of arr[i] is from 1 to n where 1 and n both are included
 * that means if the size of array is 5 then the element in the array not greater that 5.
 */

public class DupinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,8,4,3};
        List<Integer>  list = new LinkedList<>();
        for(int i=0;i<arr.length;i++) {
            int index = Math.abs(arr[i]) -1;

            if(arr[index] >0){
                arr[index] = -arr[index];
            }else{
                list.add(Math.abs(arr[i]));
            }
        }

        System.out.println(list);



        // math.abs return the absolute value means if the argument is not negative
         //then it return the argument and if the argument is negative then it return the negation of argument.
    }
}
