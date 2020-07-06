package sapient;

import java.io.IOException;

public class MethodOveriding {

    public void m1()throws InterruptedException{
        System.out.println("Inside parent class  m1 method!!");
    }

    public void m2(){
        System.out.println("Inside parent class  m2 method!!");
    }



    public static class child extends MethodOveriding{
        @Override
        public void m1() throws InterruptedException {
            System.out.println("Inside child m1 method !!");
        }

    }
    public static void main(String[] args) throws Throwable  {
        MethodOveriding child1 = new child();
        child1.m1();
    }
}
