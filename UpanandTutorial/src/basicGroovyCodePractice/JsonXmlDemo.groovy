package basicGroovyCodePractice

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

class JsonXmlDemo {
    public static void main(String[] args) {
        JsonBuilder builder = new JsonBuilder();
        builder.people{
            person{
                firstName  "upanand"
                lastName "verma"
            }
        }
        String json = '{ "simple": 123,\n' +
                '      "fraction": 123.66,\n' +
                '      "exponential": 123e12\n' +
                '    }'
        println builder.toPrettyString()
        JsonSlurper slurper = new JsonSlurper().parseText(json.toString())
        //slurper.parseText(builder.toString());
        println "${slurper.simple}"
    }






}
