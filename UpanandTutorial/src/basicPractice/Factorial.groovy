package basicPractice

class Factorial {
    public static void main(String[] args) {
        println("Enter the number for which you want fctorial !!")
        Scanner scanner = new Scanner(System.in)
        int n = scanner.nextInt()
        int result = fact(n)
        println("result ${result}")
    }

    static  int fact(int i) {
        if(i==0){
            return 1
        }else
            return i*fact(i-1)
    }
}
