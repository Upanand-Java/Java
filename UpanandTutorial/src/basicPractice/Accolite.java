package basicPractice;

public class Accolite {

    public int m1() {
        try {

            throw new Exception();
           // return 1;
        } catch (Exception e) {
            return 5;
        }
        finally {
            return 2;
        }

    }

    public static void main(String[] args) {
     /*   String s = "a";
        String s1 = new String("a");
        System.out.println(s1==s);
        System.out.println(s.equals(s1));*/
        System.out.println(new Accolite().m1());
    }

}
