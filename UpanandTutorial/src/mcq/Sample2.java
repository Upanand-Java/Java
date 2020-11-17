package mcq;

import java.io.IOException;

class lead{
    public void method1() throws Exception{
        System.out.println("Under Lead method");
    }
}




public class Sample2 extends lead {
    public static void main(String[] args) {

    }

    @Override
    public void method1() throws IOException{

    }


}
