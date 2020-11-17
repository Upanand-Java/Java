package missiondsa180Ques.binarysearch;

public class SearchInNearlySortedArray {
    /**
     * Problem statement:That position of number in unsorted array could be either ,i,i+1 or i-1
     * so if we will fix that then it will become sorted array !!
     * Let search the element in nearly sorted array.
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {10,20,40,30,60,50};// 10,20,30,40,50,60
        int search = 30;
        int res = searchEle(arr,search);
        System.out.println(res);

    }

    private static int searchEle(int[] arr, int search) {
        int start =0;
        int end = arr.length-1;
        while (end>= start){
            int mid = start +(end-start)/2;
            if(arr[mid]==search){
                return mid;
            }else if(mid -1 >= 0 && arr[mid-1]==search){
                return mid -1;
            }else if(mid+1 <= arr.length-1 && arr[mid+1]==search){
                return mid+1;
            }else if(arr[mid]> search){
                end = mid-2;
            }else if(arr[mid]< search){
                start = mid+2;
            }

        }
        return -1;
    }
}
