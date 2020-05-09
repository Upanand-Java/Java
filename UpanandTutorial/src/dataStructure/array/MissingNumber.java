package dataStructure.array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int n = arr.length;
        System.out.println("Missing number is ");
        int total = (n+1)*(n+2)/2;
       /* for(int i = 0;i<arr.length-1;i++){
            if(!(arr[i]+1 == arr[i+1])){
                int temp = arr[i]+1;
                System.out.println(" "+ temp);
            }
        }*/

       for(int i = 0;i<arr.length;i++){
           total -= arr[i];
       }
        System.out.println(total);
    }
}
