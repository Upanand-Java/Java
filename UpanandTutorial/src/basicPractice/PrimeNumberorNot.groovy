package basicPractice

class PrimeNumberorNot {
    public static void main(String[] args) {
        println("Enter the number")
        Scanner scanner = new Scanner(System.in)
        int num = scanner.nextInt()
        boolean isPrimeNumber = checkPrimeNumber(num)
        if(isPrimeNumber){
            println("Number is prime !!")
        }else {
            println("Number is not prime !!")
        }
    }

    static def boolean checkPrimeNumber(int i) {
        if(i<0){
            return false
        }else if(i==0 || i==1){
            return false
        }else if(i==2 || i==3){
            return true
        }else if((i*i-1)%24==0){
            return true
        }else{
            return false
        }
    }
}
