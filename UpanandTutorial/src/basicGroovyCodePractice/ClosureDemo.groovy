package basicGroovyCodePractice

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import groovy.xml.MarkupBuilder
import groovy.xml.XmlSlurper

class ClosureDemo {
    public static void main(String[] args) {
        def test = {}
        println test.getClass()
        println("${test instanceof Closure}")

        def name = {
            int x = 5;
            int result = x + it
            // println("${test1 instanceof Closure}")
            println("Hey closure Body !! value is ${result}")
        }
        //name(2);
        JsonBuilder builder = new JsonBuilder();
        JsonSlurper slurper = new JsonSlurper()
        XmlSlurper xmlSlurper =new XmlSlurper()
        MarkupBuilder builder1 = new MarkupBuilder();



        name(9)
        List num = [1, 2, 11, 213, 12,2, 124]
       println num.each { it>2}
            //println("${it}")

       println num.find{ it>2}

        println num.findAll{it>2}

        println num.collect{it}


        def list = ['Daffy', 'Bugs', 'Elmer', 'Tweety', 'Silvester', 'Yosemite']
        println list.find { it == 'Bugs' }

       /* def implicit = {
            println it
        }
        implicit("12345678")

        //two argument
        def twoArg = { first, last ->
            println("${first} ${last}")

        }
        twoArg("upanand", "verma")

         default value
        def defaultValue = { nameStr, greeting = "Wassup" ->
            println("${nameStr} ${greeting}")
        }
        defaultValue("uppa","hey")
        defaultValue("virat")*/

        //How closure accept n number of argument
        //def concat = { String.. argsa ->
        // argsa.join("")

       // }

       // concat()

        def set = ["a","b","c","a"] as Set
        println set
        println "a" in set
        println set.getClass()

        def map = ["a":1] as HashMap
       // println "a" in map

        println map.getClass()

        final ls = []

        println ls.getClass()




         final personList = [
                new Person("Regina", "Fitzpatrick", 25),
                new Person("Abagail", "Ballard", 26),
                new Person("Lucian", "Walter", 30),
        ]
        println personList.getClass()
        personList.stream().filter(it-> it.fname.contains("egina")).forEach(i-> println i)
        //in groovy we can use any

        def var ={ nam ->
            println "Welcome!!${nam}"
            //return "a"
        }
        println var("a");

    }

    private static String getMethod(){

        def addAll = { int ... args ->
            return args.sum()

        }

        def map =["a":3 , "v":5 ,"ac":9]
        map.collect {it.key + it.value}

        return "upanand"
    }
}



