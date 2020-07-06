package missiondsa180Ques.array;

public class ImmediateDelete {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,12,17,11,20};
        int x = 5;
        //delete immediate in 0(N) space and O(N) time complexity !!
        int j = 1;
        int[] output = new int[arr.length];
        if(arr[0] ==x || arr[arr.length-1] == x) {
            output[0] = arr[0];
            if(arr[0]==x){
                for(int i=2;i<arr.length;i++){
                    output[j] = arr[i];
                    j++;
                }
            }else{
                System.out.println(arr[arr.length-1]);
                output[arr.length-2] = arr[arr.length-1];
                for(int i=1 ; i<arr.length-2;i++){
                    output[j] = arr[i];
                    j++;
                }
                j=j+1;
            }

        }else {
            output[0]= arr[0];

            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i + 1] == x || arr[i - 1] == x) {
                    continue;

                } else {
                    output[j] = arr[i];
                    j++;
                }

            }
            j++;
            output[j-1]=arr[arr.length-1];

        }
        for(int k=0;k<j;k++){
            System.out.print(" "+output[k]);
        }
    }
}
