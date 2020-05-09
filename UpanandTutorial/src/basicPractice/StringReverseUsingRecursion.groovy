package basicPractice

class StringReverseUsingRecursion {
    public static void main(String[] args) {
        String x = "upanand"
        String res = reverse(x,x.length())
        println("res..${res}")
    }

    static def String reverse(String s, int i) {
        println("i ${i}")
        String tempVar = ""
        println("tempValue is..${tempVar}")
        if(i==0){
            println("inside if..${tempVar}")

            return tempVar
        }
        String[] splittedString = s.split("")
        println("hey..${splittedString[i-1].class}")
         tempVar=tempVar+splittedString[i-1].toString()
        println("tempVar ${tempVar}")


        return reverse(s,--i)

    }
}
