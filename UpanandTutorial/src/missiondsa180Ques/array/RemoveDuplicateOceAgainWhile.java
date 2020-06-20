package missiondsa180Ques.array;

public class RemoveDuplicateOceAgainWhile {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2,2,99,99,3,3,4,5,6,99,6,7,77};

        int i = 1;
        int j = 0;

                while(i<nums.length){
                    if(nums[i] != nums[j]){
                        j++;
                        nums[j] = nums[i];
                    }



                    i++;
                }

                for(int k=0;k<=j;k++){
                    System.out.println(","+nums[k]);
                }
    }
}
