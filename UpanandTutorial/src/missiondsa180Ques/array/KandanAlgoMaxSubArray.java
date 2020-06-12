package missiondsa180Ques.array;

public class KandanAlgoMaxSubArray {

    public static void main(String[] args) {
        int[] arr = {-222222222};

        int max_value = 0;
        int current =0;

        for(int i=0;i<arr.length;i++){
            current = current+arr[i];
            if(current < 0 ){
                current = 0;
            }
            if(max_value<current){
                max_value = current;
            }
        }
        System.out.println(max_value);



        if(max_value ==0) {
            int max_value_int = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max_value_int) {
                    max_value_int = arr[i];
                }
            }
            max_value = max_value_int;
        }

        System.out.println(max_value);



    }








}
