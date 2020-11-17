package basicGroovyCodePractice.groovytrait

trait Testtrait implements InterfaceSample ,Sample2  {

    abstract String foo()
    abstract String test()
    String fly(){
        return "Flying!!"
    }

    public static String m1(){
        return "Returing m1 method"
    }

    private String name1(){
        return "upanand";
    }

    String name;

}

