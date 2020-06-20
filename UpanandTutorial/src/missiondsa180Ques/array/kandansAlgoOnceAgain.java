package missiondsa180Ques.array;

public class kandansAlgoOnceAgain {

    public static void main(String[] args) {


        int[] arr = {-1, -3, -1, -4, -5, -3, -1, -1};
        int current = 0;
        int maxValue = 0;

        for (int i=0;i<arr.length;i++){
            current = current + arr[i];

            if(current < 0 ){
                current = 0;
            }

            if(current> maxValue){
                maxValue = current;
            }

        }
        System.out.println(maxValue);

        if(maxValue ==0){
            int small = arr[0];
            for (int i=1;i<arr.length;i++){
                if(small<arr[i]){
                    small = arr[i];
                }
            }
            maxValue = small;
        }

        System.out.println(maxValue);




    }


}
