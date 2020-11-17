package missiondsa180Ques.binarysearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,6};
        int ele = 6;
        int res = searchEle(arr,ele);
        System.out.println("res id "+res);
    }

    private static int searchEle(int[] arr, int ele) {
        int result = -1;
        int index = findPivot(arr);
        int low = 0;
        int high = arr.length -1 ;
        System.out.println(index);
        if(ele<=arr[high]){
            low = index;
        }else{
            high = index-1;
        }
        System.out.println("high"+high);
        System.out.println("low"+low);
        //0,3
        while (high>=low){
            int mid = low +(high-low)/2;
            System.out.println(mid);
             if(arr[mid]>ele){
                high = mid-1;

            }else if(arr[mid]<ele){
                low = mid+1;

            } else {
                 System.out.println(mid+"in");
                return mid;
            }
        }


        return result;

    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (end>start) {
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        System.out.println(end);
        return end;

    }
}
