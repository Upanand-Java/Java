package sapient;

import javafx.scene.Parent;

import java.io.IOException;

public class MethodOveriding {

   private void m1(int x){
        System.out.println("Inside parent class  m1 method!!");
    }

    public void m2(){
        System.out.println("Inside parent class  m2 method!!");
    }




    public static void main(String[] args) throws Throwable  {
      // child c = new MethodOveriding();
        MethodOveriding overiding = new child();
        overiding.m1(9);//overhididng not overhiding !!!
    }
}
  class child extends MethodOveriding{

    //public void m1() throws Exception {
    private void m1(int x) {
        System.out.println("Inside child m1 method !!");
    }

}
