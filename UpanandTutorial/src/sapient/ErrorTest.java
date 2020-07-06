package sapient;

public class ErrorTest {
    private static void erroetest1(){
        System.out.println("under error test1");
        throw new Error();
    }

    public static void main(String[] args) throws Error {
        try {

            erroetest1();
            System.out.println("Under try!!");

        }catch (Error e){
            System.out.println("under catch");
        }finally {
            System.out.println("under finally");
        }
        System.out.println("END !!");
    }

}
