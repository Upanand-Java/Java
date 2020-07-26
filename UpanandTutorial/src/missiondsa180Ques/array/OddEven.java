package missiondsa180Ques.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class OddEven {
    public static void main(String[] args) {
        int[] arr = {5,4,3,5,4,3,5,4,3,2,2,2,5,4,3};

        int opt = getOdd(arr);
        //1,1,1,2,2,3,3
        Arrays.sort(arr);
        Stack<Integer> integers = new Stack<>();
        integers.push(arr[0]);
        for(int i = 1;i<arr.length;i++){
           // System.out.print("hi ,");
            if( integers.size() !=0 && integers.peek()==arr[i]  ){
                integers.pop();
            }else {
                integers.push(arr[i]);
            }
             if(integers.size() == 2){
                integers.pop();
                // System.out.println(integers.peek());
                break;
            }
        }

    }

    private static int getOdd(int[] nums){
        int result =0;
        for(int i:nums){
           result ^=i;
            System.out.print(result+" ,");
        }
        System.out.println("ans "+result);
        return result;
    }
}
