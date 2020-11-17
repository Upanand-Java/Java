package missiondsa180Ques.binarysearch;

/**
 * A bitonic array is an array which contain value continuos increasing and at one
 * point it starts decreasing .
 */
public class SearchInBitonicArray {
    public static void main(String[] args) {
        int[] arr = {12,15,66,77,44,33,22,11,1};
        int key = 44;
        int res =searchInBitonicArray(arr,key);
        System.out.println(res);
    }

    private static int searchInBitonicArray(int[] arr, int key) {
        int indexOfPeakElement = getIndex(arr);
        System.out.println(indexOfPeakElement);
        int low = 0;
        int high = arr.length-1;
        if(arr[indexOfPeakElement]>=key && arr[low]<=key){
            high = indexOfPeakElement;
            while (high>=low){
                int mid = low +(high-low)/2;
                if(arr[mid] == key){
                    return mid;
                }else if(arr[mid]>key){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }else {
            System.out.println("inside");
            low = indexOfPeakElement+1;
            while (high>=low){
                int mid = low +(high-low)/2;
                if(arr[mid] == key){
                    return mid;
                }else if(arr[mid]>key){
                    low = mid+1;
                }else {
                    high = mid -1;
                }
            }
        }
        throw new IllegalArgumentException("No element found");

    }

    private static int getIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (end>=start){
            int mid = start +(end-start)/2;
            if(mid >0 && mid< arr.length-1) {
                if (arr[mid] > arr[mid+1] && arr[mid]>arr[mid-1]){
                    //System.out.println(mid);
                    return mid;
                }else if(arr[mid]>arr[mid+1]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        throw new IllegalArgumentException("Not a Bitonic array !!");
    }
}
