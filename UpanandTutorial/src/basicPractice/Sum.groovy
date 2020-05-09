package basicPractice

class Sum {
    public static void main(String[] args) {
        println("Enter the num")
        Scanner scanner = new Scanner(System.in)
        int num = scanner.nextInt()
       // long l =System.currentTimeMillis();
      //  println("l1 "+l)
       // int summation = sum(num)
        println((num*(num+1)/2))
        //long l2 = System.currentTimeMillis();
        //println("l2 "+l2)
        //println(l2-l)

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
