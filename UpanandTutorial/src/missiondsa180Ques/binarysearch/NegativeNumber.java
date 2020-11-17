package missiondsa180Ques.binarysearch;

public class NegativeNumber {
    public static void main(String[] args) {
        int [][] arr =  {{-1,3,4,-7},{4,-4,6,0}};

        int count =0;
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] <0){
                   count++;
                }
            }
        }
        System.out.println(count);
    }
}
