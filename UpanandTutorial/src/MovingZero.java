import java.util.Arrays;

public class MovingZero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,5,4,0,0,1,0};
            moveZero(arr);
    }

    private static void moveZero(int[] arr) {
        int zeroCOunt = 0;

        for(int i: arr)
        {
            if(i == 0)
                zeroCOunt++;
        }

        int countZero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0) {
                arr[countZero] = arr[i];
                countZero++;
            }
        }

        for(int i=0;i<zeroCOunt;i++) {
            arr[countZero] = 0;
            countZero++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
