package javatrickyquestion;

public class TwoCatchBlock {
    public static void main(String[] args) {
        new TwoCatchBlock().func();
    }

    private void func() {
        try{
            String a = null;
            System.out.println(1);
            System.out.println(a.length());

        }catch (NullPointerException e){
            System.out.println("inner");

        }
       // System.out.println(2);
        //catch(NullPointerException e){
        catch( RuntimeException e){
            System.out.println("outer");
        }
        finally {
            System.out.println(5);
        }
        System.out.println(2);
    }
}
