package sapient;

public class CheckNullStatic {
    public  static   void m1(){
        System.out.println("In m1 method");
    }

    public static void main(String[] args) {
        CheckNullStatic aStatic  = null;
           // aStatic = new CheckNullStatic();
            aStatic = null;
                aStatic.m1(); // internally it will call CheckNullStatic.m1() , static method we can call directly
                                //without instantiation . so no null pointer , but if we remove static it
                                // will give null pointer

    }
}
