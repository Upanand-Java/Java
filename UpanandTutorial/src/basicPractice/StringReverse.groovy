package basicPractice

class StringReverse {
    public static void main(String[] args) {
        String inp = "Upanand"
        String x = ""
        for(int i = inp.length()-1;i>=0;i--){
            x+=inp[i]
        }
        println"print reverse string ${x}"
    }
}
