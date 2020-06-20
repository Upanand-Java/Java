package missiondsa180Ques.array;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,1};
        int minimumPosInt = 1;

     /*   if()*/

        for(int i = 0;i<nums.length;i++){
            if(minimumPosInt >= nums[i] && nums[i]>0){
              //  System.out.println("array value "+nums[i]+" minimum pos "+minimumPosInt);
                minimumPosInt++;
                System.out.println("MInimum "+minimumPosInt);
            }
        }

        //return minimumPosInt;
        System.out.println("val is "+minimumPosInt);
    }
}
