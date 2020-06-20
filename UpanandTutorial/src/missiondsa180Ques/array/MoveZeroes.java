package missiondsa180Ques.array;

import java.util.Stack;

public class MoveZeroes {
    public static void main(String[] args) {
       //int[] nums = {0,1,0,3,12,0,9};
        int[] nums = {0,1,0,3,12};
        move(nums);
    }

    private static void move(int[] nums) {
       // int i =1;

        int count = 0;

        for(int i = 0;i<nums.length;i++){

            if(nums[i]==0){
                count++;
            }

        }
        System.out.println(count);

        Stack<Integer> integerStack = new Stack<>();




        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                integerStack.push(nums[i]);
            }
        }

        for(int i=0;i<count;i++) {
            integerStack.push(0);
        }
        System.out.println(integerStack);


        for(int i=nums.length-1;i>=0;i--){
            System.out.println(integerStack.peek());
            nums[i] = integerStack.peek();
            integerStack.pop();
        }

        for(int k:nums){
            System.out.print(k);
        }







        /*if(nums.length>2) {
            int j = nums.length - 1;
            int prevPointer = 0;
            while (j >= i) {
                // System.out.println(nums[i]);

                if (nums[prevPointer] == 0 && nums[i] != 0) {
                    System.out.println("Inside of "+nums[i]+""+nums[prevPointer]+" "+i+" prev pointer "+prevPointer);
                    swaps(nums, prevPointer, i);
                    prevPointer++;
                    i++;
                } else {
                    i++;
                }
                prevPointer++;

            }
        }else
            if(nums[0]==0){
                swaps(nums,0,1);

        }

        for(int n:nums)
        System.out.println(n);*/

    }

    private static void shiftByBit(int[] nums, int i) {
        for(int k = 1;k<nums.length;k++){
            if(k!=0) {
                nums[k - 1] = nums[k];
            }
        }
    }


}
