package missiondsa180Ques.array;

public class RemoveDUplicates {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2,2,99,99,99,3,3,4,5,6,6,77};

       /* int startPointer = arr[0];
        int temp = 1;

        for(int i=1;i<arr.length;i++){

            if(arr[i] == startPointer){
                continue;
            }else{
                arr[temp] = arr[i];
                temp++;
                startPointer = arr[i];
            }

        }
        System.out.println(temp);*/

        int i = 1; //iterator thru array
        int j = 0; //current index
        for (; i<nums.length; i++) {
            if (nums[i] != nums[j]) { //new number
                j++; //move current index
                nums[j] = nums[i]; //fill current index with new number
            }
        }
       // return j+1;
        System.out.println(j);

        for(int k=0;k<=j;k++){
            System.out.print(nums[k]+" ,");
        }
    }
}
