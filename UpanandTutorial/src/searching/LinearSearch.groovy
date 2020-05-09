package searching

/**
 * The time complexity of below  algorithm is O(n).
 * Linear search is rarely used practically because other search algorithms such as the binary search
 * algorithm and hash tables allow significantly faster searching comparison to Linear search.
 */
class LinearSearch {
    public static void main(String[] args) {
        println("Enter the length of array")
        Scanner scanner = new Scanner(System.in)
        int length = scanner.nextInt()
        int[] input = new int[length]
        println("Enter  the ${length} number ")

        for(int i = 0 ; i<=length-1 ; i++){
            input[i] = scanner.nextInt()
        }
        println("Enter the target number")
        int target = scanner.nextInt();
       int index =  linearSearch(input , target)
        if(index == -1){
            println("Element does not found")
        }else{
            println("Element found at ${index} location")
        }



    }

    /**
     *
     * @param integers
     * @param i
     * @return
     */
    static def   linearSearch(int [] integers, int i) {


        for(int j=0 ; j<=integers.length-1;j++)
        {
           if(integers[j]==i){
              return j;

           }
        }
      return -1

    }
}
