package missiondsa180Ques.binarysearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,-3,-2,-1,0,1,3,4};
        searchPivot(arr);
    }

    private static void searchPivot(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while (s<e) {
            int mid = s + (e - s) / 2;
            if(arr[mid]>arr[e]){
                s = mid+1;
            }else
                e  = mid;




        }





        System.out.println(arr[s]);
    }
}
