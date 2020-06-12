package basicPractice;

public class Segregattor {
    public static void main(String[] args) {
        int arr[] = {-5,-4,9,0,8,6,-2,10};
        arrange(arr);
        for(int i : arr)
            System.out.print(i+",");
    }

    private static void arrange(int[] arr) {

        int j = 0;
        int t;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
                j++;
            }
        }
    }
}
