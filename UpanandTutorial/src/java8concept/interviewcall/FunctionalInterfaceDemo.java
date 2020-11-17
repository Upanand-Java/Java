package java8concept.interviewcall;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    default   int add(int i , int j){
      return -1;
    }

    public abstract int add(int i );
}

class Hey{
    public static void main(String[] args) {
        FunctionalInterfaceDemo interfaceDemo = (i)->{
            return i;
        };
        interfaceDemo.add(1);
    }
}
