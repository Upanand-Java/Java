package java8concept.abstractinterfacediffJava8;

public interface InterfaceJava8Feature {

    public abstract void m1();

    public abstract String m2(String name);

    public  default String m3(String name){
        System.out.println("Inside default method m3");
        return name;
    }

    public static String m4(String name){
        System.out.println("Inside static method m4");
        return name;
    }

    public static void main(String[] args) {
        System.out.println("main method");
        InterfaceJava8Feature.m4("Upanand");
    }

   /* static {
        int a;
    }*/ //- Static block not allowed in interface

}
