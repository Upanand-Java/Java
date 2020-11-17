package mcq;

public class Sample4 {
    public static void main(String[] args) {
        System.out.println(method(18 , 4));

       // float[] floats = new float[5];
        Float[] floats = new Float[5];
        Object obj = floats;
        System.out.println(floats[0]);
    }

    private static int method(int i, int i1) {
        try{
            int x = i/i1;
            System.out.println(x);
            return x;

        }catch(Exception e){
            System.out.println("Exception");
            return 0;
        }

    }
}
