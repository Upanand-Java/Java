package basicPractice

class recursionString {
    public static void main(String[] args) {
        String s = "upanand"
        String res = reverse(s)
        println("result..${res}")
    }

    static def String reverse(String s) {
        if(s.length()==1){
            return s
        }else{
            return s.substring(s.length()-1)+reverse(s.substring(0,s.length()-1))
        }
    }
}
