package basicPractice;

public interface Test {
    abstract String am1();
    abstract String am2();

    default String m1(){
        return "returning m1 method";
    }

  public static String sm1(){
        return "returnig from static method !!";
    }
}
