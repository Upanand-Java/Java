package java8concept;

public class ImplementSampleFI    {


    /*SampleFunctionalInterface functionalInterface = ()->{
        System.out.print("My name ");
        return "is Upanand";
    };
*/
    SampleFunctionalInterface anInterface = new SampleFunctionalInterface() {
        @Override
        public String abdMethod() {
            return null;
        }

        @Override
        public String abdMethod1() {
            return null;
        }
    };

    public static void main(String[] args) {
        ImplementSampleFI i = new ImplementSampleFI();
       String x  =  i.abdMethod();
        //System.out.println(i.m1());
      String a =  SampleFunctionalInterface.static_m1();
        System.out.print(x);
        System.out.println(a);
    }

  //  @Override
    public String abdMethod() {
        return null;
    }

   // @Override
    public String abdMethod1() {
        return null;
    }
}
