package mcq;

public class Sample6 {
    public int x = 0;
    public int y =0;

    public Sample6(int x , int y){
        this.x = x;
        this.y =0;
    }


    public static void main(String[] args) {
        System.out.println(throwMethod());
    }

    private static int throwMethod() {
        try {
            throw new ClassNotFoundException();

        }catch (Exception e){
            throw new NullPointerException();

        }
    }
}
