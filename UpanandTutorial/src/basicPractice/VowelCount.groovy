package basicPractice

class VowelCount {
    public static void main(String[] args) {
        String x = "upanana"
        int count = 0
        for(int i =0;i<=x.length()-1;i++){
            if(x[i]== "a" || x[i]== "e" || x[i]=="i" || x[i]=="o" || x[i]=="u"){
                count++ ;
            }
        }
        println("value is ${count}")
    }
}
