package missiondsa180Ques.binarysearch;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,3,3,3,3,3,3,3,7,9};
      int fisrtOccurence =   binarySearchProg(arr,3);
        System.out.println(fisrtOccurence);
        int lastOccur = binarSearchLastOccur(arr,3);
        System.out.println(lastOccur);
        int countOfTotalNumer = lastOccur-fisrtOccurence +1;
        System.out.println(countOfTotalNumer);

    }

    private static int binarSearchLastOccur(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        int result = -1;

        while (end>=start){
            int mid = start+ (end-start)/2;
            if(nums[mid]== target){
                result = mid;
                start = mid+1;
            }else if(nums[mid]>target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }


        return result;


    }

    private static int binarySearchProg(int[] nums, int target) {
        int result  = -1;
        int start =0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start +(end -start)/2;
            if (nums[mid] == target) {
                result = mid;
                end = mid-1;
            }else if(nums[mid]> target){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return result;




    }


}
