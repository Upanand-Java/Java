package missiondsa180Ques.array;

public class RepeatAndMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4,3,5,6};
        repeatingNum(nums);
        missingNum(nums);
    }

    private static void missingNum(int[] nums) {
        int sum=0;
        for(int i=0;i< nums.length;i++){
           // System.out.println(nums[i]);
             sum += nums[i];

        }
        int z = nums.length-1;
        int totalsum = (z *(z+1))/2;
        System.out.println(totalsum);
        System.out.println(sum);

    }

    private static void repeatingNum(int[] nums) {
    }


}
