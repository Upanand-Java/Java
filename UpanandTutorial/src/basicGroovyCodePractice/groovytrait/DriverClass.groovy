package basicGroovyCodePractice.groovytrait

class DriverClass {
    public static void main(String[] args) {
        TraitImpl traitImpl = new TraitImpl();
        println("method ${traitImpl.test()}")
        println("${TraitImpl.m1()}")

        traitImpl.test();
    }
}
