package multithreading;

import java.util.Arrays;

public class PrintOddNumber {

    Runnable  r = ()->{
        for(int i=1;i<10;i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }
    };

    public static void main(String[] args) {
      //  Thread t1 = new Thread(new PrintOddNumber().r);
      //  t1.start();
        int[] arr = {1,3,1,3,2,1,39,22,0,-2,7};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sorting(int[] arr) {
        int length = arr.length-1;

        mergesort(arr ,0,length );
    }

    private static void mergesort(int[] arr, int start, int length) {
        if(length>start) {
            int mid = (length+start)/2;
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, length);
            merge(arr, start,mid, length);
        }
    }

    private static void merge(int[] arr, int start, int mid ,int length) {

        int left = mid-start+1;
        int right = length-mid;

        int[] leftArray = new int[left];
        int[] rightArray = new int[right];

        //4,5,6,7 //8,9,11,12
        for(int i=0;i<left;i++){
            leftArray[i] = arr[start+i];
        }

        for(int i=0;i<right;i++){
            rightArray[i] = arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k = start;
        while (i<left && j<right){
            if(leftArray[i]<=rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else if(leftArray[i]>rightArray[j]){
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i<left){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<right){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }
}
