package missiondsa180Ques.array;

import java.util.Stack;

public class PositiveNegative {

    public static void main(String[] args) {

        int[] arr = {-1, 2, 3,7,-8, -5 ,- 2,5};
         //filterArray(arr);
         filterArrayWithStack(arr);
    }

    private static void filterArrayWithStack(int[] arr) {
        Stack<Integer> integers = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                integers.push(arr[i]);
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                integers.push(arr[i]);
            }
        }

        for(int j = arr.length-1;j>=0;j--){
            arr[j] = integers.peek();
            integers.pop();
        }

        System.out.println("stack Impl: ");
        for(int k: arr){
            System.out.print(k+",");
        }







    }

    private static void filterArray(int[] arr) {

        int negative = arr.length-1;
        int positive = 0;
        int i =0;


            while (negative>positive){
            if(arr[i]<0){
                swap(arr , i , negative);
                negative--;


            }else if(arr[i]>0){

                positive++;
                i++;

            }
            else{
                i++;
            }
        }

        for(int j : arr){
            System.out.print(j+" ");
        }




    }

    private static void swap(int[] arr, int p1,int p2){

        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;

    }

}
