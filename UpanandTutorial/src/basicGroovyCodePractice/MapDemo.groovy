package basicGroovyCodePractice

class MapDemo {
    public static void main(String[] args) {
        def map = [:]
        println("${map}")
        println("${map.getClass()}")

        def person = [first1:"uppu",second1:"virat"]
        println("${person} , class ${person.getClass()}")
        println("${person.second1}")
        person.email = "upanandxy00@gmail.com"
        println("${person}")

        for( entry in person){
            println entry
        }
        for(key in person){
            println("${key }")
        }
    }
}
