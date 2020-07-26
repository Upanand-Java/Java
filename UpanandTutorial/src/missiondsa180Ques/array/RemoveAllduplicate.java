package missiondsa180Ques.array;

public class RemoveAllduplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];

            }
        }
        for(int k=0;k<j+1;k++){
            System.out.print(arr[k]+" ,");
        }
    }
}
