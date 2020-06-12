package missiondsa180Ques.array;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.swap;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,1,2,1,0,0,2,1,0};
        //int[] arr = {1,2,0};
        onePassSolution(arr,arr.length);
       // twoPassSolution(arr,arr.length);

       
    }

    private static void twoPassSolution(int[] arr, int length) {

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for(int i=0;i<length;i++){
            if(arr[i]==0){
                countZero++;
            }else if(arr[i]==1){
                countOne++;
            }else{
                countTwo++;
            }
        }

        for(int i=0;i<length;i++){
            if(i<countZero){
                arr[i] = 0;
            }else if(i<(countOne+countZero)){
                arr[i] = 1;
            }else {
                arr[i] =2;
            }
        }

        System.out.println("two pass solution is");
        for(int k:arr){
            System.out.print(k);
        }



    }







    private static void onePassSolution(int[] arr, int length) {
        int lastpointer = length-1;
        int startpointer = 0;

        for(int i =0;i<=lastpointer;i++){
            System.out.println("Inside for");
            if(arr[i]==0){

                swapVar(arr , i,startpointer++);
            }else{
                if(arr[i]==2) {

                    swapVar(arr,i--,lastpointer--);

                }
            }
        }

       /* int lt = 0, i = 0, gt = nums.length - 1;
        while (i <= gt) {
            System.out.println("inside while");
            if (nums[i] == 0) {
                swapVar(nums, lt++, i++);
            } else if (nums[i] == 2) {
                swapVar(nums, i, gt--);
            } else { // nums[i] == 1
                i++;
            }
        }*/


        System.out.println("One pass solution is:-");
        for(int arrValue: arr){
            System.out.print(arrValue);
        }
        
        
    }

    private static void swapVar(int[] arr, int i, int startpointer) {

        int temp = arr[i];
        arr[i] = arr[startpointer];
        arr[startpointer] = temp;
    }
}
