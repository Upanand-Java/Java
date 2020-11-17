package missiondsa180Ques.binarysearch;

public class FirstOccurenceOnceAgain {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,4,4,7};
        int key = 4;
        getFirstOccurence(arr , key);
    }

    private static void getFirstOccurence(int[] arr, int key) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while (end>=start){
            int mid = start+(end-start)/2;
            if(arr[mid]==key){
                result = mid;
                end = mid-1;
            }else if(arr[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        System.out.println("val is "+result);


    }
}
