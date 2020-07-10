package javatrickyquestion;

/**
 * static and private method is not overriding it is method hiding
 */
public class StaticPrivateMethodOveriding {
    public static   void m1(int x) {
        System.out.println("hey !!" + x);
    }

     private void m2(){
        System.out.println("In m2 method !!");
    }
    public static void main(String[] args) {

    }
}
    class child extends StaticPrivateMethodOveriding{


        public static void m1(int x){
            System.out.println();

        }


        private void m2(){

        }



}
