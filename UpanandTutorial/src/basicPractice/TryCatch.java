package basicPractice;

public class TryCatch {
    public static void main(String[] args) {
      int x = arr();
        System.out.println(x);
    }

    private static int arr() {
        try{
            throw new Exception();
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}
