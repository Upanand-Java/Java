package missiondsa180Ques.binarysearch;

public class SearchElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,9,12,34,55,65,76,78,76,87};
        //suppose this is infinite array that it tends to infinity.
        int key = 12;
      int result =  doBinarySearch(arr,key);
        System.out.println(result);

    }

    private static int doBinarySearch(int[] arr, int key) {
        System.out.println(key);
        int start =0;
        int end = 1;
        while(arr[end]<=key){
            System.out.println(arr[end]);
                start = end;
                end = 2*end;


        }

        System.out.println("Start is "+arr[start]+" end is "+arr[end]);
        int index = doBinSearch(arr , start,end,key);

        return index;
    }

    private static int doBinSearch(int[] arr, int start, int end, int key) {

        while (start<= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]>key){
                end = mid -1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }
}
