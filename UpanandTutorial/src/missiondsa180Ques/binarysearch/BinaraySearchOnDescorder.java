package missiondsa180Ques.binarysearch;

public class BinaraySearchOnDescorder {
    public static void main(String[] args) {
        int[] arr = {55,44,11,9,7,4,3,1};
        int k = 11;
      int res  =  binSearch(arr , k);
        System.out.println(res);
    }

    private static int binSearch(int[] arr , int search) {

        int start = 0;
        int end = arr.length-1;

        while(end>=start){
            int mid = start +(end-start)/2; //,3,5,6 , to improve the code and avoid integer overflow
                                            // in this scenerio corner case would not flow
            //System.out.println(mid);
            if(search<arr[mid]){
                start = mid+1;
            }else if(search>arr[mid]){
                    end = mid-1;
            }else if(arr[mid] == search) {
                return mid;

            }
        }
        return -1;

    }
}
