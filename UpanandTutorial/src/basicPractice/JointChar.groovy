package basicPractice

class JointChar {
    public static void main(String[] args) {
        String s1 = "outer"
        String s2 = "space"
        String x = ""


        for(int i = 0; i<=s1.length()-1;i++){
            x+=s1[i]
            x+=s2[i]
        }
        println("Joint string is ${x}")


    }
}
