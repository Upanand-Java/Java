package basicPractice

class PrintBiggestNumberInArray {
    public static void main(String[] args) {
        println("Enter the size of array")
        Scanner scanner = new Scanner(System.in)
        int size = scanner.nextInt()
        println("Enter the value of array")
        int[] numberAray = new int[size]
        for(int i=0;i<=size-1;i++){
            numberAray[i] =scanner.nextInt()
        }
        //Iterative method
       // int biggestNumber = findBiggestNUmber(numberAray)
        //Recursive method
        int biggestNumber = findBigUsingRecursive(numberAray,numberAray.length-1)
        println("Biggest number in array is ${biggestNumber}")
    }

    /*static  int findBiggestNUmber(int[] ints) {
        int bigNumber = ints[0]
        for(int i = 1;i<=ints.length-1;i++){
            if(bigNumber<ints[i]){
                bigNumber = ints[i]
            }
        }
        return bigNumber
    }*/

      static int findBigUsingRecursive(int[] ints, int n) {

        int bigNumber
          bigNumber = Integer.MIN_VALUE
          if(n == -1){
            return bigNumber
        }else{
            if(ints[n]>bigNumber)
                bigNumber = ints[n]
        }
        return findBigUsingRecursive(ints,n-1)
    }
}
