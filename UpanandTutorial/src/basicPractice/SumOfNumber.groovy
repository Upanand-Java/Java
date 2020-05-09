package basicPractice

class SumOfNumber {
    public static void main(String[] args) {
        println("Enter the number to add from 1")
        Scanner scanner = new Scanner(System.in)
        int n = scanner.nextInt()
        int m = sum(n)
        println("Addition is ${m}")

    }

    static int sum(int i) {
        int count = 0;
        for(int j=1; j<=i;j=j+1){
           // println("add is ${j}")
            count += j
        }
        return count;

    }
}
