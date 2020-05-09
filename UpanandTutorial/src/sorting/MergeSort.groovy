package sorting

/**
 * The above recurrence can be solved either using Recurrence Tree method or Master method.
 * It falls in case II of Master Method and solution of the recurrence is \Theta(nLogn).
 * Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best)
 * as merge sort always divides the array into two halves and take linear time to merge two halves.
 * Auxiliary Space: O(n)
 * Algorithmic Paradigm: Divide and Conquer
 * Sorting In Place: No in a typical implementation
 * Stable: Yes
 */
class MergeSort {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        println("Enter the length of array that you want to sort !!")
        Scanner scanner = new Scanner(System.in)
        int length = scanner.nextInt()
        int []arr = new int[length]
        println("Enter the value of array !!")
        for(int i = 0;i<=length-1;i++){
            arr[i] = scanner.nextInt()
        }
       int []sortedArray =  divide(arr , 0 , length-1)
        println("sorted array is :")
        for(int j=0;j<=length-1;j++){
            println("${sortedArray[j]} ")

        }
    }


    /**
     *
     * @param ints
     * @param low
     * @param high
     * @return
     */
    static def int[] divide(int[] ints, int low, int high) {
        if(low<high) {
            int mid = (low + high) / 2
            divide(ints,low,mid)
            divide(ints,mid+1,high)
            int []mergedArray = merge(ints,low,mid,high)
        }
    }

    /**
     *
     * @param ints
     * @param low
     * @param mid
     * @param high
     * @return
     */
    static def int[] merge(int[] ints, int low, int mid, int high) {
         int n1 = mid-low+1
         int n2 = high-mid;

        //create two temp array
        int []l = new int[n1]
        int []r = new int[n2]

        //copy data in temp array
        for(int i=0;i<n1;i++){
            l[i] = ints[low+i]
        }
        for(int j=0;j<n2;j++){
            r[j] = ints[mid+1+j]
        }
        //Initializing initial index as zero
        int i = 0;
        int j = 0;
        int k = low;
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                ints[k] = l[i]
                i++
            }else{
                ints[k]=r[j]
                j++;
            }
            k++
        }
        //copy remaining element to new array
        while(i<n1){
            ints[k] = l[i]
            i++;
            k++;
        }
        while(j<n2){
            ints[k] = r[j]
            j++
            k++
        }
        return ints;
    }
}
