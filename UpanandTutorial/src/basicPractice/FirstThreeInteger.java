package basicPractice;

public class FirstThreeInteger {
    public static void main(String[] args) {
        int[] a = {1,23,11,44,11,444,23,44,2,455,3,44,33,4,3};
        for(int i = 0;i<=a.length-1;i++){
            int minElement = i;
            for(int j = i+1;j<=a.length-1;j++) {
                if (a[j] < a[minElement]) {
                    minElement = j;

                }
            }
                int temp = a[minElement];
               a[ minElement] = a[i];
                a[i] = temp;

        }
        System.out.println("Sorted array");
        for(int l=0;l<=a.length-1;l++){
            System.out.println(a[l]);
        }
        System.out.println("three largest array is");
        int k = a.length;
        System.out.println(a[a.length-1]);
        System.out.println(a[a.length-2]);
        System.out.println(a[a.length-3]);
    }
}
