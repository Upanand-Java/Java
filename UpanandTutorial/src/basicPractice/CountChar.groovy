package basicPractice

class CountChar {


    public static void main(String[] args) {

        String x = "Upanand"
        char c = "o"
        int numberOfTimes = count(x , c)
        println("count is ${numberOfTimes}")
    }

    static  int count(String s, char a) {
        int iterator = 0
        for(int i=0;i<=s.length()-1;i++){
            if(s[i].toString()==a.toString()){
                iterator++
            }
        }
        return iterator

    }
}

