package searching

/**
 * Prequisite the searched array should be sorted one
 * The idea of binary search is to use the information that the
 * array is sorted and reduce the time complexity to O(Log n).
 */
class BinarySearch {
    public static void main(String[] args) {
        println("Enter the number of element that you want to search !!")
        Scanner scanner = new Scanner(System.in)
        int totalLength = scanner.nextInt()
        println("Enter the sorted array for search !!")
         int[] sortedArray = new int[totalLength]
        for(int i=0;i<=totalLength-1;i++){
            sortedArray[i] = scanner.nextInt()
        }
        println("Enter the element that you want to search !!")
        int searchedElement  = scanner.nextInt()

        int index = binarySearch(sortedArray,0,totalLength,searchedElement)
        if(index == -1){
            println("Element does not found in the array !!")
        }else{
            println("Element found at ${index}th location !!")
        }



    }

    /**
     *
     * @param ints -> sorted array
     * @param left => leftmost index of sorted array
     * @param right -> Rightmost index of sorted array
     * @param toBeSearched -> the element that we have to search !!
     * @return
     */
    static  int binarySearch(int[] ints, int left, int right, int toBeSearched) {
        int lastElement = right-1
        if(left==lastElement){ //condition that need to handle if the array contains only one element!!
           if(ints[left]== toBeSearched){
               return left;
           } else{
               return -1
           }
        }
        else {
           int mid = left+ (lastElement)/2
            println("after binary")
            if(ints[mid]==toBeSearched){
                println("Inside mid")
                return mid;

            }
            if(ints[mid]>toBeSearched)
            {

                //take left subarry
               return binarySearch(ints ,left,mid-1,toBeSearched)

            }
            //take recursively right subarray

           return binarySearch(ints , mid+1 , right,toBeSearched)
        }
        return -1
    }
}
