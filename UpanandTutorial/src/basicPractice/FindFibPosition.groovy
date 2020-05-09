package basicPractice

class FindFibPosition {
    public static void main(String[] args) {
        println("Enter the number for which you want there fib position")
        Scanner scanner = new Scanner(System.in)
        int n = scanner.nextInt()
        int result = findFib(n)
        if(result == -1){
            println("Not found")
        }
        println("Result is ${result}")
    }

    static  int findFib(int i) {
        if(i<1) {
            return -1
        }
            else if(i==1 || i==2){
            return i-1
        }else{
            return findFib(i-1)+ findFib(i-2)
        }

    }
}
