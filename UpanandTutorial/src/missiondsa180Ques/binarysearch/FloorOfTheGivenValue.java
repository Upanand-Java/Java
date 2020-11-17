package missiondsa180Ques.binarysearch;

/**
 * Problem Statement: we need to find the floor of the given value in the sorted array !!
 * i.e - Greatest number less than given value.
 */
public class FloorOfTheGivenValue {
    public static void main(String[] args) {
        int[] arr = {1,4,8,33,43,55};
        int search = 0;
        int res = getFloor(arr , search);
        System.out.println(res);
        int resCeiling = getCeiling(arr,search);
        System.out.println(resCeiling);

    }

    private static int getFloor(int[] arr, int search) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while (end>=start){
            int mid = start +(end-start)/2;
            if(arr[mid]==search){
                return mid;

            }
           else if(arr[mid]>search){ //10,20,25,30

                end = mid-1;
            }else {
                result = mid;
                start = mid+1;
            }
        }

        //System.out.println(start+" result "+end);







        return result;
    }

    private static int getCeiling(int[] arr, int search) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while (end>=start){
            int mid = start +(end-start)/2;
            if(arr[mid]==search){
                return mid;

            }
            else if(arr[mid]>search){
                end = mid-1;
                result = mid;
            }else {
                start = mid+1;
            }
        }

        //System.out.println(start+" result "+end);



       // if(start>arr.length-1)
           // return -1;



        return result;
    }
}
