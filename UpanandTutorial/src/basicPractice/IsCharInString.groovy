package basicPractice

class IsCharInString {
    public static void main(String[] args) {
        String x = "Upanand"
        char c = 'm'
        boolean a = isChar(x,c)
        if(a){
            println("Its there")
        }
        else{
            println("Absent")
        }

    }

    static  boolean isChar(String s, char c) {
        for(int i=0;i<=s.length()-1;i++){
            if(s[i].toString() ==c.toString()){
                return true
            }
        }
        return false


    }
}
