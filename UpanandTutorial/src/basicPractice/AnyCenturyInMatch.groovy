package basicPractice

class AnyCenturyInMatch {
    public static void main(String[] args) {
        println("Enter the number of player who batted in the inning !!")
        Scanner scanner = new Scanner(System.in)
        int noOfPlayer = scanner.nextInt()
        println("Enter the score of the each batsman")
        int[] scores = new int[noOfPlayer]
        for(int i =0;i<=noOfPlayer-1;i++){
            scores[i] = scanner.nextInt()

        }
        boolean isCentury = century(scores)
        if(isCentury)
            println("century is there")
        else
            println("Century is not there")


    }

    /**
     *
     * @param ints
     * @return
     */
    static  boolean century(int[] ints) {
        for(int j=0;j<=ints.length-1;j++){
            if(ints[j]>=100){
                return true
            }
        }
        return false
    }
}
