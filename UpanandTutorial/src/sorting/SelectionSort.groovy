package sorting

/**
 * Time Complexity: O(n2) as there are two nested loops.
 * Auxiliary Space: O(1)
 * The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
 */
class SelectionSort {
    public static void main(String[] args) {
        println("Enter the length of the array that you want to be sorted !!")
        Scanner scanner = new Scanner(System.in)
        int length = scanner.nextInt()
        println("Enter the value in the array ")
        int[] randomArray = new int[length]
        for(int i = 0;i<=length-1;i++){
            randomArray[i] = scanner.nextInt()
        }
        int[] res = reverseArray(randomArray)
        println("Reverse array is:")
        for (int i = 0; i < res.length; i++) {

          println("${res[i]}")

           }


        sortAndPrintArray(randomArray)

    }

    static  void sortAndPrintArray(int[] ints) {
        for(int j=0;j<=ints.length-1;j++){
            int minElement = j
            for(int k=j+1;k<=ints.length-1;k++){
                if(ints[k]<ints[minElement]){
                    minElement = k;
                }
            }
            int temp = ints[minElement]
            ints[minElement] = ints[j]
            ints[j] = temp

        }
        println(" Sorted Array")
        for(int l=0;l<=ints.length-1;l++){
            println("${ints[l]} ")
        }

    }
    static int[] reverseArray(int[] a) {
        int j =a.length;
        int[] tempArr = new int[a.length];
        for(int i=0;i<a.length;i++){
            println("value is ${a[i]}")
            tempArr[j-1] = a[i];
            j = j-1;

        }
        return tempArr;


    }
}
