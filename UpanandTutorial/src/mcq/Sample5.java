package mcq;

public class Sample5 {
    public static void main(String[] args) {


        System.out.println(SampleMethod());

    }

    private static int SampleMethod() {
        int i =0;
        try{
            i = 100/0;
            return i;


        }catch (Exception e)
        {
            System.out.println("in catch");
            i = 200/0;

           // return i;

        }finally {
            i =300;
            System.out.println(i);
            return i;



        }

    }
}
