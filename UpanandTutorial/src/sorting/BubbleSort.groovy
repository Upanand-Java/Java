package sorting
/**
 * The below function always runs O(n^2) time even if the array is sorted.
 * It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
 * Auxiliary Space: O(1)
 * Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
 */
class BubbleSort {
    public static void main(String[] args) {
        println("Enter the array that you want to sorted with Bubble sort !!")
        Scanner scanner = new Scanner(System.in)
        int lengthOfArray = scanner.nextInt()
        int[] randomArray = new int[lengthOfArray]
        println("Enter the value of the array !!")
        for(int i = 0;i<=randomArray.length-1;i++){
            randomArray[i] = scanner.nextInt()
        }

        printAndSortArray(randomArray)
    }
/**
 * The main point is that here we are not using "=" in both loops coz need iterate n-1 times
 * @param ints
 */
    static def void printAndSortArray(int[] ints) {
        boolean isSwappedRequired
        for(int i =0; i<ints.length-1;i++){
          //for optimised condition introduced isSwappedRequired variable
            isSwappedRequired = false
            for(int j=0;j<ints.length-i-1;j++){
                if(ints[j]>ints[j+1]){
                    int temp = ints[j+1]
                    ints[j+1] = ints[j]
                    ints[j] = temp
                    isSwappedRequired = true;
                }
            }
            if(isSwappedRequired == false){
                break
            }
        }

        for(int k=0;k<=ints.length-1;k++){
            println("${ints[k]} ")
        }
    }
}
