package missiondsa180Ques.array;

public class SHuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7,8,9};
        int n = nums.length;

        int i = 0;
        int j = n/2;
       // int[] res = new int[n];
        int temp=0;
        while(i<n-2){
            nums[temp]=nums[i];
            temp++;
            swaps(nums,i+1,j);
            i=i+2;
            temp = temp+2;
            j++;
            for(int k:nums){
                System.out.print(" "+k);
            }
            System.out.println();


        }

        //return res;
    }

    private static void swaps(int[] nums, int i, int j) {
        System.out.println("i-> "+i+"j->"+j);
        for(int k=i;k<j;k++){
            nums[k] = nums[k-1];
        }

        for(int t:nums){
            System.out.print(" "+t);
        }
        nums[i] = nums[j];
        System.out.println("under");

        System.out.println();

    }
}
