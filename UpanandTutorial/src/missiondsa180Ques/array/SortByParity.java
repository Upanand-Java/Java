package missiondsa180Ques.array;

public class SortByParity {
    public static void main(String[] args) {
        int[] A = {3,1,2,4,0};
        sortByArrayParity(A);
    }

    private static void sortByArrayParity(int[] A) {
        if(A.length ==0){
           // System.out.println(new int[]{0});
        }
        int odd = A.length-1;
        int even = 0;
        int i = 0;

        while (odd>even){
            if(A[i]%2 != 0){
                swaps(A , i,odd);
                odd --;
            }else if(A[i]%2 == 0){
                even ++;
                i++;
            }else{
                i++;
            }
        }
        for(int k:A){
            System.out.print(" "+k);
        }




    }

    private static void swaps(int[] arr, int p1, int p2) {

        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
