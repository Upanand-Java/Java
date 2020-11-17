package missiondsa180Ques.array;

public class KandanAlgoMaxSubArray {

    public static void main(String[] args) {
        int[] arr = {992,-3,7,61,-9,-9999+99999};

        int max_value = 0;
        int current =0;

        for(int i=0;i<arr.length;i++){
            current = current+arr[i];
            /*if(current < 0 ){
                current = 0;
            }*/
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
    public static int getMax(int[] arr){
        int current =0;
        int max_value = 0;

        for(int i: arr){
            current = current+i;
            if(current<0){
                current = 0;
            }
            max_value = Math.max(max_value,current);
        }
        return max_value;

    }








}
