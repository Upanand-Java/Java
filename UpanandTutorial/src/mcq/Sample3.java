package mcq;

public class Sample3 {
    public static void main(String[] args) {
        System.out.println("Something return "+ Something());
    }

    /**
     * we could write try without catch and that should be with finally.
     * if we are returning from try and finally both then finally value would be the result.
     * we can take Wrapper class also in a method signature
     * @return
     */
    private static Integer Something() {
        while (true){
            try{
                System.out.println("hey");
                return 1;
               // System.out.println("ff");
            }finally {
                System.out.println("dd");
               // break;
                return 3;
            }

        }
       // return 2;
    }
}
