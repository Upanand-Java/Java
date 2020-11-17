package valuelabs;

public class SecondMaxSecondMin {
    public static void main(String[] args) {
        int[] arr = {47,5,2,31,4,44,55,31,56};
        int sm = secondMax(arr);
        System.out.println(sm);
        int smin = secondMin(arr);
        System.out.println(smin);

    }

    private static int secondMin(int[] arr) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                result = min;
                min = i;
            }else if(i<result){
                result = i;
            }
        }

        return result;
    }


    private static int secondMax(int[] arr) {
        int result = 0;
        int max = 0;

        for(int i:arr){
            if(i>max){
                result = max;
                max =i;

            }else if(i>result){
                result =i;
            }
        }


        return result;
    }
}
