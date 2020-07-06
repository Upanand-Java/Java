package missiondsa180Ques.array;

public class TargetArray {
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] target = new int[index.length];


        for (int i = 0; i < nums.length; i++) {
            if (index[i] == i) {
                target[index[i]] = nums[i];
            } else {
                // target[index[i]] = nums[i]
              target =   bitShift(index[i], target,nums[i]);
            }
        }

        // return target;
        for(int o:target){
            System.out.print(o+" ");
        }

    }


    private static int[] bitShift(int req ,int[] target,int val) {
        for (int k = req; k < target.length-1; k++) {
            target[k-1] = target[k];

        }
        target[req] = val;

        return target;

    }
}
