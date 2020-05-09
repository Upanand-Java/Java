package basicGroovyCodePractice

class ListDemo {
    public static void main(String[] args) {
        List a =[1,2,3,4]
        println("${a}")
        println a.getClass()
        List b = [1,2,3,4,53,2] as LinkedList
        b << [1,2]
        println(b.flatten())
        println(b.getClass())
        println("${b.getAt(0..3)}")

        for(ints in b){
            println(ints)
        }

        def number  = [1,2,41,2,1,2,4,2,1,2,5,4,3] as HashSet
        println("without duplicate element in number ${number} , ${number.getClass()}")
    }
}
