package basicPractice

class Pallindrome {
    public static void main(String[] args) {
        String x = "adam"
        String a = "";
        for(int k = x.length()-1;k>=0;k--){
            //print(x[k])
            a+=x[k];
        }
        println(a)
        if(x.trim()==a.trim()){
            print("Given String is pal")
        }else{
            print("Not")
        }
    }
}
