package basicGroovyCodePractice

class ClosureDemo {
    public static void main(String[] args) {
        def test = {}
        println test.getClass()
        println("${test instanceof Closure}")

        def name = { test1 ->
            int x = 5;
            int result = x + test1
            // println("${test1 instanceof Closure}")
            println("Hey closure Body !! value is ${result}")
        }

        name(9)
        List num = [1, 2, 11, 213, 12, 124]
        num.each { it ->
            println("${it}")
        }

        def implicit = {
            println it
        }
        implicit("12345678")

        //two argument
        def twoArg = { first, last ->
            println("${first} ${last}")

        }
        twoArg("upanand", "verma")

    // default value
        def defaultValue = { nameStr, greeting = "Wassup" ->
            println("${nameStr} ${greeting}")
        }
        defaultValue("uppa","hey")
        defaultValue("virat")

        //How closure accept n number of argument
       /* def concat = { String.. args ->
         args.join("")

        }*/


    }
}



