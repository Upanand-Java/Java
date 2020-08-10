package java8concept;


public interface SampleFunctionalInterface {

    public abstract String abdMethod();
    public abstract String abdMethod1();

     default String m1(){
         return "default m1 Method";
      }

      static String static_m1(){
         return "static m1 method";
      }

}
