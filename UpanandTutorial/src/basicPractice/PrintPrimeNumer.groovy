package basicPractice

class PrintPrimeNumer {
    public static void main(String[] args) {
        println("Enter the upper limit for which you want prime number !!")
        Scanner scanner = new Scanner(System.in)
        int upper = scanner.nextInt()
        println("Enter the lower limit for which you want prime number")
        int lower = scanner.nextInt()
        List<Integer> primeList = new ArrayList<Integer>()
        primeList = (Integer)printPrimeNumber(upper,lower)
        println("hi")
        for(int i: primeList){
            println("${i} ,")
        }
    }

    static def Class<List> printPrimeNumber(int upper, int lower) {
        List<Integer> list = new ArrayList<Integer>()
        for(int i=lower;i<=upper;i++){
            if((i*i-1)%24==0){
                list.add(i)
            }
        }
        println("hey")
        return list

    }
}
