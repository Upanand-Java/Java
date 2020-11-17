package missiondsa180Ques.binarysearch;

public class NextAlphabetical {
    public static void main(String[] args) {
        char[] arr = {'a','c','f','h','k'};
        char key = 'l';
        getNext(arr ,key);
    }

    private static void getNext(char[] arr, char key) {
        int start = 0;
        int end = arr.length-1;

        while (end>=start){
            int mid = start+(end-start)/2;
            if(arr[mid] == key){
                System.out.println("floor and ceil is:"+(mid)%arr.length);
                break;
            }else if(arr[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        System.out.println("floor is "+arr[end%arr.length]);
        System.out.println("ceil is "+arr[start%arr.length]);
    }
}
