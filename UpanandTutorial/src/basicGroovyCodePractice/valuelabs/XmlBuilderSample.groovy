package basicGroovyCodePractice.valuelabs

import groovy.xml.MarkupBuilder
import org.junit.Test

class XmlBuilderSample {
    public static void main(String[] args) {
        def writer = new StringWriter()
        def xml = new MarkupBuilder(writer).books{
            book(){
                author("J K ROwling")
                Edition("Seventh")
            }
        }
        println writer.toString()
    }


}
