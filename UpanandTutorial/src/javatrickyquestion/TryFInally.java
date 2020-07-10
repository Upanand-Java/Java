package javatrickyquestion;

/**
 * This example illustrate that if u use return statement in try or catch still finally block will execute.
 * But if you put System.exit() then the control will exit with that given status without executing
 * finally block
 */
public class TryFInally {
    public static int m1() {
        try {

            System.exit(9);
            return 1;
        }catch (Exception e){
            System.out.println("IN catch !!");

        }finally {
            System.out.println("I am in finally");
        }
        return 5;
    }
    public static void main(String[] args) {
       int x = TryFInally.m1();
        System.out.println(x);

    }
}
