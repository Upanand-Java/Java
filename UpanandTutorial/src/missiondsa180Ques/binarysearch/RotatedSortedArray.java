package missiondsa180Ques.binarysearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr ={4,6,1,2,3,};
         int noOfRotation = getNumber(arr);
        System.out.println("Result is "+noOfRotation);
        int noOfRotation1 = getSmallestElement(arr);
        System.out.println("Result is "+noOfRotation1);
    }

    private static int getNumber(int[] arr) {
        //to computed number of rotation in unsorted array  , so that if we did not rotate then it be
        //sorted.
        // For that we have to compute the index of smallest number.i.e 2
        int result = -1;
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        while (end>=start){
            int mid = start +(end-start)/2;
            System.out.println(mid);
            int prev =( mid+n-1)%n; // to avoid out of bound exception cover corner case of array
            System.out.println(prev);
            int next = (mid+1)%n; // // to avoid out of bound exception cover corner case of array
            System.out.println(next);
            if(arr[mid]<arr[prev] && arr[mid]<arr[next]){
               // return n-mid; // this mean our output less than prev and less than next
                return n-mid; // this mean our output less than prev and less than next
            }else if(arr[mid]>=arr[start]){ // here we have to out two part which is sorted , need to discard
                  start = mid+1;                  // the sorted part
            }else if(arr[end]>=arr[mid]){
                end = mid-1;
            }
        }
        return result;
    }

    private static int getSmallestElement(int[] arr){  //5,6,7,1,4
        int start = 0;
        int end = arr.length-1;
        while (end>start){
            int mid =start +(end-start)/2;
            if(arr[mid]>arr[end]) start = mid+1;
            else end = mid;


        }
        System.out.println("Start is "+arr[start]);
        return start;
    }
}
