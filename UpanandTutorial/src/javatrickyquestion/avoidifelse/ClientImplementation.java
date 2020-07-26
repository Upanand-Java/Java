package javatrickyquestion.avoidifelse;

public class ClientImplementation {
    public static void main(String[] args) {
       // FactoryClass factoryClass = new FactoryClass();
        ClientImplementation implementation = new ClientImplementation();
        int x = implementation.Calculate(3,4,"multiply");
        System.out.println(x);


    }

    public int Calculate(int a, int b,String operation){
        Operator target = FactoryClass.optionalOperator(operation).orElseThrow(()->new IllegalArgumentException("INVALID"));
        return target.apply(a,b);

    }
}
